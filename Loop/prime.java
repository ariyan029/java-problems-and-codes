import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Welcome to the Prime Checker!");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = input.nextInt();
        
        if (isPrime(num)) {
            System.out.println("The number " + num + " is a prime number.");
        } else {
            System.out.println("The number " + num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        // Handle special cases
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= num / 2; i++) { // Loop till num/2
            if (num % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}
