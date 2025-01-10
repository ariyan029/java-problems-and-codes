
import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        System.out.println("welcome to the code of ReverseOfDigit");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int num = input.nextInt();
        int reverse = DigitReverse(num);
        System.out.println("the reverse of " + num + " is " + reverse);
    }
    public static int DigitReverse(int num){
        
        int newNum = 0;
        while (num!=0){
        newNum= newNum*10 + num%10;
        num/=10;
        }
        return newNum;
    }
}
