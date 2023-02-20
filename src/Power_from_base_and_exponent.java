import java.util.Scanner;

public class Power_from_base_and_exponent {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the base number ");
        int base = reader.nextInt();
        System.out.println("enter the exponent");
        int exp = reader.nextInt();
        int ans = 1;
        for(;exp!=0;exp--){
            ans = ans*base;

        }
        System.out.println("The answer is "+ans);
    }
}
