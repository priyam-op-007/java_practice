import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number = reader.nextInt();
        System.out.println("Enter the second number");
        int number1 = reader.nextInt();
        int c = number + number1;

        System.out.println("the addition of both the entered numbers is "+c);

    }
}
