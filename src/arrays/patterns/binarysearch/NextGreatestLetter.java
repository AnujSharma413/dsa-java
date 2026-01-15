package arrays.patterns.binarysearch;

public class NextGreatestLetter {
    /**
     * Problem: Find the next greatest letter in a sorted character array.
     *
     * Definition:
     *     Return the smallest character that is strictly greater than the target.
     *     The array is circular, so if no character is greater than target,
     *     return the first character of the array.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static char nextGreatestLetter(char[] letters,char target){

        int start = 0;
        int end = letters.length-1;
        // Default result handles circular condition
        char res = letters[0];

        while(start <= end){
            int mid = start + (end - start)/2;

            // Possible answer found, move left to find smaller greater letter
            if(target < letters[mid]){
                res = letters[mid];
                end = mid - 1;
            }
            // Move right if current letter <= target
            else{
                start = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        char[] letters = {'a','c','f','h'};
        char target = 'b';
        System.out.println(nextGreatestLetter(letters,target));
    }
}
