package pr2;

import java.util.Scanner;

class Dog
{
    private String nick;
    private int age;

    Dog(String nick,int age)
    {
        this.nick=nick;
        this.age=age;
    }

    void getNickname()
    {
        System.out.println("Кличка: "+nick);
    }
    void getAge()
    {
        System.out.println("Возраст: "+age);
    }
    void setNick(String nickk){
        nick=nickk;
    }
    void setAge(int agee)
    {
        age=agee;
    }

    void changesAge()
    {
        age=age/7;
        System.out.println("Возраст человеческий: "+age);
    }

    void ToString()
    {
        System.out.println("Кличка: "+nick+" "+"Возраст: "+age);
    }
}

class TestKennelDogs
{
    private  Dog [] dog =new Dog[4];
    void KennelDogs()
    {
        Scanner scan=new Scanner(System.in);
        dog[0]=new Dog("Ральф",49);
        Dog dog1=dog[0];
        dog1.ToString();
        dog[1]=new Dog("Гендальф",28);
        Dog dog2=dog[1];
        dog2.ToString();

    }
    void addArray()
    {
        Scanner scan=new Scanner(System.in);
            String s=scan.nextLine();
            int a=scan.nextInt();
            dog[2]=new Dog(s,a);
            Dog dog1=dog[2];
            dog1.ToString();
    }
}
public class Deuxdeux {
    public static void main(String[] args) {
        TestKennelDogs dogss=new TestKennelDogs();
        dogss.KennelDogs();
        dogss.addArray();
    }
}
