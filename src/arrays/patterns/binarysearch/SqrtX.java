package arrays.patterns.binarysearch;

public class SqrtX {
    /**
     * Finds the floor value of square root of x using Binary Search
     * Example:
     * x = 8 → output = 2
     * x = 16 → output = 4
     */
    private static int mysqrt(int x) {

        // Edge case
        if(x == 0 || x == 1) return x;

        int low = 1;
        int high = x;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            /*
              Instead of mid * mid > x (overflow risk),
              we use mid > x / mid
            */
            if(mid > x/mid){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        /*
         When loop ends:
         - low has crossed the actual sqrt
         - high is the floor sqrt value
        */
        return high;
    }
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mysqrt(x));
    }
}
