package pr3;

import java.util.Scanner;


class  Circle{
    private int r;//Радиус
    private int d;//Диаметр


    public Circle(int c,int g)
    {r=c;d=g;}

    public void setR(int R)
    { r=R; }

    public void setD(int A)
    { d=A; }

    public int getR()
    { return r; }

    public int getD()
    { return d; }

    public int S()
    {
        return 4*3*r*r;

    }
}


public class Threeone {

    public static void main(String[] args) {

        Test();
    }


    static void Test() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Радиус = ");
        int R = scan.nextInt();
        System.out.println("R = " + R);
        System.out.print("Диаметр = ");
        int D = scan.nextInt();
        System.out.println("D = " + D);
        Circle Theyden = new Circle(R, D);
        Theyden.getD();
        Theyden.getR();
        System.out.println("Площадь = " + Theyden.S());
        System.out.print("Радиус = ");
        Theyden.setD(scan.nextInt());
        System.out.print("Диаметр = ");
        Theyden.setR(scan.nextInt());
        System.out.println("Площадь = " + Theyden.S());
    }

}
