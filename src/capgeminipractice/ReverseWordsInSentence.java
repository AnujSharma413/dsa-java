package capgeminipractice;

public class ReverseWordsInSentence {
    static String reverseWords(String sentence) {
        String[] arr = sentence.split(" ");
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reConnect = String.join(" ",arr);
        return reConnect;
    }

    public static void main(String[] args) {
        String str = "Capgemini is hiring in 2026";
        System.out.println(reverseWords(str));
    }
}
