package pr1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class one {

    public static void main(String[] args) {

    sd1();
    sd2();
    }
    public static void sd1()
    {
        Scanner scan = new Scanner(System.in);
        int []arr=new int[10];
        for (int i=0;i<10;i++)
        {
            arr[i]=(int)(Math.random()*1000);
            System.out.print(" "+arr[i]);
        }

        for(int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
                if(arr[i]>arr[j])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
        }
        System.out.println();
        for (int i=0;i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }}

    public static void sd2()
    {
        final Random   rand =new Random();
        Scanner scan = new Scanner(System.in);
        int []arr1=new int[10];
        System.out.println(" ");
        for (int i=0;i<10;i++)
        {
            arr1[i]=rand.nextInt()/1000;
            System.out.print(" "+arr1[i]);
        }
        Arrays.sort(arr1);

        System.out.println();
        for (int i=0;i<10;i++)
        {
            System.out.print(" "+arr1[i]);
        }



    }
}

