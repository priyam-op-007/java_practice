import java.util.Scanner;

public class largest_among_three_numbers_by_if_else_part_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        double number1 = reader.nextDouble();
        System.out.println("enter the second number");
        double number2 = reader.nextDouble();
        System.out.println("enter the third number");
        double number3 = reader.nextDouble();

        if(number1 == number2 && number1>number3) {
                System.out.println("number 1 "+number1+ " and number 2 "+number2+" are largest numbers");
        }
        else if(number1==number3 && number1>number2) {
                System.out.println("number 1 "+number1+ " and number 3 "+number3+" are largest numbers");
        }
        else if(number2==number3 && number2 > number1) {
            System.out.println("number 2 "+number2+ " and number 3 "+number3+" are largest numbers");
        }
        else{
            System.out.println("All are the largest number");
        }





    }
}
