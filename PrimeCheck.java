// Basic Approach for checking Prime numbers where we if a number n is divisible by any integer from 2 to n-1.

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(51)); // true
    }
}

