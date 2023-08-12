package aop;

import org.springframework.stereotype.Component;

@Component()
public class UnivLibrary extends  AbstractLibrary{
    public  void getBook(){
        System.out.println("Мы берем книгу из UnivLibrary");
        System.out.println("-----------------------------");
    }

    public String ReturnBook(){
        System.out.println("Мы возвращаем книгу в UnivLibrary");
        return " Война и мир";

    }


    public  void getMagazine(){
        System.out.println("Мы берем журнал из UnivLibrary");
        System.out.println("-----------------------------");

    }

    public void ReturnMagazine(){
        System.out.println("Мы возвращаем журнал в UnivLibrary");
        System.out.println("-----------------------------");

    }

    public  void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в UnivLibrary");
        System.out.println("-----------------------------");

    }

    public  void addMagazine(){
        System.out.println("Мы добавляем журнал в  UnivLibrary");
        System.out.println("-----------------------------");

    }




}
