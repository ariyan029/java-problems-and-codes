
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome number checker ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number :");
        int num = input.nextInt();
        boolean isPalindrome = PalindromeCheck(num);
        if(isPalindrome){
            System.out.println("your number is palindrome ");
        }
        else{
            System.out.println("your number is not palindrome ");
        }

    }
    public static boolean PalindromeCheck(int num){//this funciton used to chekeck the number is palindrome or not 111
        return num==DigitReverse(num);
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
