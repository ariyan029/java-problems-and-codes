
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibonacci number calculator ");
        System.out.println("please enter the number :"); 
        int num = input.nextInt();
        System.out.println("The Fibonacci series is");
        Fibo(num);

    }
    public static void Fibo(int num){
        if(num<0) return;
        System.out.println("0 ");
        if(num==0) return;
        System.out.println("1 ");
        int first = 0,second = 1;
        while(first +second <= num){
            int third = first + second;
            System.out.println(third+" ");
            first = second;
            second = third;
        }
        
    }
}
