
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("welcome to sum of digit calculator code");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int num=input.nextInt();
        int sum = DigitSum(num);
        System.out.println("the sum of the digits of " + num + "is " + sum);
    }
    public static int DigitSum (int num ){
        int sum=0;
        for ( int i = 0;i<=sum;i++){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}
