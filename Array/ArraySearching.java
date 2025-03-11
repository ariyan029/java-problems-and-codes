
import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("welcome to array searching ");
        Scanner input = new Scanner(System.in);
        int[] arr={11,54,1,75,79,58,80};
        System.out.println("Please enter the number :");
        int num =input.nextInt();
        boolean found =isFound(arr, num);
        if (found){
            System.out.println("the number is found in the array");
        }else {
            System.out.println("the number is not found in the array");
        }

    }
    public static boolean isFound(int arr[],int num){
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]==num){
               return true;
        }
        
    }
    return false;
   }
}
