import java.util.Scanner;

public class odd_or_even_by_if_else {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number");
        int number = reader.nextInt();
        if(number%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("Number is odd");
        }

    }

}
