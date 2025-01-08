
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("welcome to area calculator of a rectangle ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the base :");
        float base = input.nextFloat();
        System.out.println("please enter the height :");
        float height= input.nextFloat();
        double area = 0.5*base*height;
        System.out.println("the area of a triangle is :"+area);

    }
}
