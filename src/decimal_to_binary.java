import java.util.*;

public class decimal_to_binary {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          String b = "";
          while(a!=0){
              b = a%2 + b;
              a = a/2;
          }
          System.out.println(b);
      }
}
