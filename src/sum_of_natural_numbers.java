import java.util.Scanner;

public class sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number");
        int num = reader.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println("the sum is "+sum);
    }
}
