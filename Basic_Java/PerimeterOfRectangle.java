
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("welcome to perimeter calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter all 4 sides  of the rectangle :");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();
        float Perimeter= a+b+c+d;
        System.out.println("THE perimeter of rectangle is "+Perimeter);


    }
}
