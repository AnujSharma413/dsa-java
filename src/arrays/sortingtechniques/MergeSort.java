package arrays.sortingtechniques;

public class MergeSort {
    // Recursively splits the array into halves
    static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr,left,mid);         // Left half
            mergeSort(arr,mid+1,right);     // Right half
            merge(arr, left, mid, right);    // Merge them back
        }
    }
    // Merges two sorted sub-arrays
    static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy data to temp arrays
        for(int x = 0; x < n1; x++){
            lArr[x] = arr[left+x];
        }
        for(int x = 0; x < n2; x++){
            rArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge temp arrays back in sorted order
        while(i < n1 && j < n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of lArr
        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        // Copy remaining elements of rArr
        while(j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,4,5,2,1,3};

        System.out.println("Before Sorting:");
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length-1);

        System.out.println("After Sorting:");
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}