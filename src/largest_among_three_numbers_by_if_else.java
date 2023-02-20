import java.util.Scanner;

public class largest_among_three_numbers_by_if_else {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        double number1 = reader.nextDouble();
        System.out.println("enter the second number");
        double number2 = reader.nextDouble();
        System.out.println("enter the third number");
        double number3 = reader.nextDouble();

        if(number1 >= number2 && number1 >= number3) {
            if(number1 != number2 && number1 != number3)
            {
                System.out.println("the first number "+number1 +" is the largest number");
            }
            else if(number1 == number2) {
                System.out.println(number1+"and"+number2+"are the largest numbers");
            }
            else {
                System.out.println(number1+"and"+number3+"are the largest numbers");
            }
        }
        else if(number2 >= number1 && number2 >= number3) {
            if(number2 != number3)
            {
                System.out.println("the second number "+number2 +" is the largest number");
            }
            else {
                System.out.println(number2+"and"+number3+"are the largest numbers");
            }


        }
        else if(number1 == number2 && number2 == number3 && number1 == number3){
            System.out.println("all numbers are largest");
        }
        else {
            System.out.println(number3+"is the largest number");
        }
    }
}
