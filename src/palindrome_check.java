import java.util.*;

public class palindrome_check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean palindrome = true;
        int start = 0;
        int end = a.length() - 1;
        while (start < end ){
            if (a.charAt(start) != a.charAt(end)){
                palindrome = false;
                break;

            }
            start++;
            end--;
        }
        if (palindrome){
            System.out.println("Its a palindromic string");
        }
        else{
            System.out.println("Its not a palindromic string");
        }

    }
}
