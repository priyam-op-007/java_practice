
import java.util.*;
public class areass implements Area {
    @Override
    public void circle(){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double areacircle = 3.142*radius*radius;
        System.out.println(areacircle);
    }
    @Override
    public void square(){
        Scanner sc2 = new Scanner(System.in);
        double l = sc2.nextInt();
        double areasquare = l*l;
        System.out.println(areasquare);
    }
    @Override
    public void triangle(){
        Scanner sc4 = new Scanner(System.in);
        double base = sc4.nextInt();
        double height = sc4.nextInt();
        double areatri = 0.5*base*height;
        System.out.println(areatri);
    }

    @Override
    public void rectangle(){
        Scanner sc3 = new Scanner(System.in);
        double b = sc3.nextInt();
        double h = sc3.nextInt();
        double arearec = b*h;
        System.out.println(arearec);

    }
    public static void main(String[] args){
        areass geometry = new areass();
        geometry.circle();
        geometry.square();
        geometry.triangle();
        geometry.rectangle();

    }



}
