import java.util.Scanner;

public class odd_or_even_by_ternary_operator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number");
        int number = reader.nextInt();
        String oddEven = (number%2==0) ? "even" : "odd";
        System.out.println(number+" is " +oddEven);
    }
}