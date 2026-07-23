package capgeminipractice;

public class CheckNumberIsPrime {
    static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(isPrime(num));
    }
}
