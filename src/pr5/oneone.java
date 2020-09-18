package pr5;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.lang.Math;

abstract class Shape
{
    protected int  a,b,S,P;
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape
{
    Circle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    void area()
    {
        S=a*b;
        System.out.println("Площадь: "+S);
    }

    void perimeter()
    {
        P=(a+b)*2;
        System.out.println("Периметр: "+P);
    }




}

class Rectangle extends Shape
{
    private int c;
    Rectangle(int a,int b)
    {
        this.a=a;
        this.b=b;

    }

    void area()
    {
        S=a*b;
        System.out.println("Площадь: "+S);
    }

    void perimeter()
    {
        P=(a+b)*2;
        System.out.println("Периметр: "+P);
    }
}

class Square extends Shape
{
    Square(int a)
    {
        this.a=a;
    }

    void area()
    {
        S=a*a;
        System.out.println("Площадь: "+S);
    }

    void perimeter()
    {
        P=a*4;
        System.out.println("Периметр: "+P);
    }
}
public class oneone {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Круг: ");
        Rectangle s2=new Rectangle(4,2);
        s2.area();
        s2.perimeter();
        System.out.println("Квадрат: ");
        Square s3=new Square(3);
        s3.area();
        s3.perimeter();
        System.out.println("Прямоугольник: ");
        Circle s1=new Circle(5,5);
        s1.area();
        s1.perimeter();
    }
}
