
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("welcome to factorial calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number :");
        int num = input.nextInt();
        int fact = factor(num);
        System.out.println("The factorial of " + num + " is " + fact);

    }
    public static int factor(int num){
        int multi = 1;
        for (int i = 1; i<=num;i++){
            multi*=i;
            
        }
        return multi;
    }
}
