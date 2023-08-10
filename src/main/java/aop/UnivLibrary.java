package aop;

import org.springframework.stereotype.Component;

@Component()
public class UnivLibrary extends  AbstractLibrary{
    public  void getBook( Book book){
        System.out.println("Мы берем книгу из UnivLibrary" + " " +book.getName());
    }

    public    String ReturnBook(){
        System.out.println("Мы возвращаем книгу в UnivLibrary");
        return "OK";
    }


    public  void getMagazine(){
        System.out.println("Мы берем журнал из UnivLibrary");
    }
}
