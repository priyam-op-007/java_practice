import java.util.Scanner;

public class vowel_or_consonant_by_if_else {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give a alphabet");
        char ch = reader.next().charAt(0);
        if(ch == 'i' || ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u') {
            System.out.println("its a vowel");
        }
        else{
            System.out.println("its a consonent");
        }
    }
}
