
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        System.out.println("welcome to simple interest calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the ammount ");
        int ammount = input.nextInt();
        System.out.println("please enter the time :");
        float time = input.nextFloat();
        System.out.println("please enter the rate :");
        float rate = input.nextFloat();
        float interest = (ammount*time*rate)/100;
        System.out.println("the simple interest is :"+interest);
    }
}
