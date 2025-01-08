
import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        System.out.println("welcome to compound interest calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principal ammount :");
        int principal = input.nextInt();
        System.out.println("please enter the time");
        float year = input.nextFloat();
        System.out.println("please enter the interest rate :");
        float rate = input.nextFloat();
        double interest = principal*Math.pow((1+rate/100),year);
        System.out.println("the compound interest is :"+interest);
        
    }
}
