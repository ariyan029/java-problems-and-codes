
import java.util.Scanner;

public class leepYear {
    public static void main(String[] args) {
        System.out.println("welcome to leep year calculator :");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the year to year :");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("the year is a leep year ");

        }else {
            System.out.println("the year is not a leep year ");
        }
    }
}
