import java.util.Scanner;
import java.lang.Math;
import java.util.logging.SocketHandler;

import static javafx.scene.input.KeyCode.R;


abstract class  Human{
   private int string;

   abstract void color();//цвет
   abstract void longa();//длина
}

class Head extends Human{
    private int a,b;
    Head(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Head: ");
    }
    void color(){
        System.out.println("Цвет: Черный");
    }
    void longa()
    {
        int S=a*b;
        System.out.println("Длина: "+S);
    }
}
class Leg extends Human{
    private int a,b;
    Leg(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Leg: ");
    }
    void color(){
        System.out.println("Цвет: Белый");
    }
    void longa()
    {
        int S=a*b;
        System.out.println("Длина: "+S);
    }
}
class Hand extends Human{
    private int a,b;
    Hand(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Hand: ");
    }
    void color(){
        System.out.println("Цвет: Розовый");
    }
    void longa()
    {
        int S=a*b;
        System.out.println("Длина: "+S);
    }
}

public class Threedeux {

    public static void main(String[] args) {
        Head s1=new Head(5,5);
        s1.color();
        s1.longa();
        System.out.println();

        Leg s2=new Leg(6,6);
        s2.color();
        s2.longa();

        System.out.println();
        Hand s3=new Hand(3,3);
        s3.color();
        s3.longa();

    }
}
