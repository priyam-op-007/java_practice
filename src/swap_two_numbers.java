import java.util.Scanner;

public class swap_two_numbers {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("give the first number");
        float number = reader.nextFloat();
        System.out.println("give the second number");
        float number1= reader.nextFloat();
        float temp = number;
        number = number1;
        number1 = temp;
        System.out.println("first number is now "+number + " and second number is now "+number1);
    }
}
