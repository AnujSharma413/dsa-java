package capgeminipractice;

public class SumOfDigitsUsingRecursion {
    static int sumOfDigits(int n) {
        if(n <= 0){
            return 0;
        }
        int rem = n % 10;
        return rem + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n));
    }
}
