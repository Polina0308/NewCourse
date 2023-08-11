package aop;

import org.springframework.stereotype.Component;

@Component()
public class UnivLibrary extends  AbstractLibrary{
    public  void getBook(){
        System.out.println("Мы берем книгу из UnivLibrary");
    }

    public void ReturnBook(){
        System.out.println("Мы возвращаем книгу в UnivLibrary");
    }


    public  void getMagazine(){
        System.out.println("Мы берем журнал из UnivLibrary");
    }

    public void ReturnMagazine(){
        System.out.println("Мы возвращаем журнал в UnivLibrary");
    }

    public  void addBook(){
        System.out.println("Мы добавляем книгу в UnivLibrary");
    }

    public  void addMagazine(){
        System.out.println("Мы добавляем журнал в  UnivLibrary");
    }




}
