package bytexl.moderndsa1.arrays.twopointer;

public class RemovingDuplicatesFromSortedArray {
    static int removeDuplicates(int[] arr){
        int write = 1;
        for(int read = 1; read < arr.length; read++){
            if(arr[read] != arr[read-1]){
                arr[write] = arr[read];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
