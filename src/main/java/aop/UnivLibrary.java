package aop;

import org.springframework.stereotype.Component;

@Component()
public class UnivLibrary extends  AbstractLibrary{
    @Override
    public  void getBook(){
        System.out.println("Мы берем книгу из UnivLibrary");
    }

    public    String ReturnBook(){
        System.out.println("Мы возвращаем книгу в UnivLibrary");
        return "OK";
    }


    public  void getMagazine(){
        System.out.println("Мы берем журнал из UnivLibrary");
    }
}
