
import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        System.out.println("welcome to reverse triangle pattern ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of rows :");
        int row = input.nextInt();

    
   
        for (int i = 1;i<=row;i++){
            for (int j=row;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
