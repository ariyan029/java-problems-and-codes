
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("welcome to sum calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you first number :");
        int num1=input.nextInt();
        System.out.println("please enter you second number :");
        int num2=input.nextInt();
        int sum = num1+num2;
        System.out.println("the sum of two number is :"+sum);
    }
}
