import java.util.Scanner;

public class vowel_consonant_by_switch_statement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter an alphabet");
        char ch = reader.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("its a consonant");
        }
    }
}
