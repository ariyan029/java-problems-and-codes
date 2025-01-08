import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        System.out.println("welcome to temperature converter ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the temperature in fahrenheit:");
        float fahrenheit=input.nextFloat();
        float celcious= (fahrenheit-32)*5/9;
        System.out.println("Temp in celcious is "+celcious);
        
    }
}
