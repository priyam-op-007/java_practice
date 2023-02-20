import java.util.Scanner;
public class multiply_two_floating_point_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter float number 1");
        float number = reader.nextFloat();
        System.out.println("Enter float number 2");
        float number1 = reader.nextFloat();
        float c = number*number1;
        System.out.println("the resultant multiplication is "+c);


    }
}
