import java.util.Scanner;

public class Number_reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number");
        int num = reader.nextInt();
        int reversed = 0;
        for(; num !=0;num/= 10 ){
            int digit = num%10;
            reversed = reversed*10 + digit;


        }
        System.out.println("The reversed number is "+reversed);
    }
}
