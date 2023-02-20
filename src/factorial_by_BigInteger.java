import java.math.BigInteger;
import java.util.Scanner;

public class factorial_by_BigInteger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number");
        int num = reader.nextInt();
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <=num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of "+num+ " is "+fact);
    }
}
