
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("welcome to number swapping");
        Scanner input = new Scanner(System.in);
        System.out.println("pease enter the first numbre :");
        int num1 = input.nextInt();
        System.out.println("please enter the second number :");
        int num2= input.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping the value of num1 is "+num1);
        System.out.println("after swapping the value of num2 is :"+num2);
    }
}
