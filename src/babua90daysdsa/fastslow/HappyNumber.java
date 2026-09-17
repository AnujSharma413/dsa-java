package babua90daysdsa.fastslow;

public class HappyNumber {
    static int sumOfSquareOfDigits(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }

        return sum;
    }
    static boolean isHappy(int n){
        int slow = n;
        int fast = sumOfSquareOfDigits(n);

        while(fast != 1 && fast != slow){
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));
        }

        return fast == 1;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
