package pr3;

class Book{
    private String author,name,year;

    Book(String author,String name,String year){
        this.author=author;
        this.name=name;
        this.year=year;
    }

    void getAll(){
        System.out.println("Автор:"+author+" "+"Название:"+name+" "+"Год:"+year);
    }
    void getAuthor(){
        System.out.println("Автор: "+author);
    }
    void getName(){
        System.out.println("Название: "+name);
    }
    void getYear(){
        System.out.println("Год: "+year);
    }
    void setAuthor(String art)
    {
       author=art;
    }
    void setName(String art)
    {
        name=art;
    }
    void setYear(String art)
    {
        year=art;
    }
}

public class Threethree {
    public static void main(String[] args) {
    Book s1=new Book("Пушкин","Скупой рыцарь","1926");
    s1.getAll();
    s1.setAuthor("Лермонов");
    s1.setName("Странный человек");
    s1.setYear("1976");
    s1.getAuthor();
    s1.getName();
    s1.getYear();
    s1.getAll();
    }
}
