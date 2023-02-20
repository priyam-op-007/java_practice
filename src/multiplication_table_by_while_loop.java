import java.util.Scanner;

public class multiplication_table_by_while_loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number for its multiplication table ");
        int num = reader.nextInt();
        int i = 1;
        while (i <=num) {
            int c = num*i;
            System.out.println(num+" * "+i+" = "+c);
            i++;

        }
    }
}
