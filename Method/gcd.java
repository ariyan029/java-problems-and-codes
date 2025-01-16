import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        System.out.println("welcome to gcd calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number :");
        int num1 = input.nextInt();
        System.out.println("please enter the second number :");
        int num2 = input.nextInt();
        int GCD = Gcd(num1, num2);
        System.out.println("the gcd of "+num1+ " and " + num2+" is "+GCD);
    }
    public static int Gcd(int num1, int num2){
        int Gcd = 1;
        int i = 2;
        int least = Least(num1, num2);
        while(i<=least){
            if (num1%i==0 && num2 % i == 0){
                Gcd = i;
            }
            i++;
        }
        
        return Gcd;
      

    }
    public static int Least (int num1 ,int num2){
        if (num1 >num2 ){
        return num1 ;
        }
        else {
        return num2;
        }
    }
}
