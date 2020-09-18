package pr1;

import java.util.Scanner;
import java.lang.Math;

class factt {
    int fact(int N) {

        if(N< 0) return 0;
        if(N ==0) return 1;
        else return N * fact(N -1);
}
        }
public class Deux {
    public static void main(String[] args) {
        factt a=new factt();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число: ");
        int s=scanner.nextInt();
        System.out.println(a.fact(s));


    }

}
