import java.util.Scanner;

public class Compute_quotient_and_remainder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give the first number");
        int nuber = reader.nextInt();
        System.out.println("give the second number");
        int muber = reader.nextInt();
        int c = nuber/muber;
        int b = nuber%muber;
        System.out.println("the quotient is "+c +" and the remainder is "+b);
    }
}
