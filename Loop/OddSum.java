public class OddSum {
    public static void main(String[] args) {
        System.out.println("Welcome to the odd number sum calculator!");
        int sum = oddSum(10); // You can change 20 to any number you want.
        System.out.println("The sum of odd numbers up to the given number is " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= num; i++) { // Loop through numbers from 1 to num
            if (i % 2 != 0) { // Check if the number is odd
                sum += i; // Add the odd number to the sum
            }
        }
        return sum; // Return the final sum
    }
}

