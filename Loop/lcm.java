
import java.util.Scanner;

// import java.util.Scanner;

// public class lcm {
//     public static void main(String[] args) {
//         System.out.println("Welcome to LCM Calculator!");
//         Scanner input = new Scanner(System.in);

//         System.out.print("Please enter the first number: ");
//         int num1 = input.nextInt();

//         System.out.print("Please enter the second number: ");
//         int num2 = input.nextInt();

//         int lcm = least(num1, num2);
//         System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
//     }

//     public static int least(int num1, int num2) {
//         // Calculate the GCD using Euclidean algorithm
//         int gcd = gcd(num1, num2);
//         // LCM formula
//         return (num1 * num2) / gcd;
//     }

//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }
//lets try another method 
public class lcm {
    public static void main(String[] args) {
        System.out.println("welcome to lcm calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number :");
        int num1 = input.nextInt();
        System.out.println("please enter the second number :");
        int num2 = input.nextInt();
        int LCM = Lcm(num1, num2);
        System.out.println("the lcm of "+num1+" and  "+num2+" is "+LCM);
    }
    public static int Lcm (int num1,int num2){
        int i = 1;
        while (i<=num2){
        int factor = num1 *i;
        if(factor%num2==0){
            return factor;
        }
        i++;
        }

        return 0;
    }
}
//............output........
/*
  welcome to lcm calculator 
please enter the first number :
15
please enter the second number :
20
the lcm of 15 and  20 is 60
 */