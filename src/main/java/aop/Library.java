package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public  void getBook(){
        System.out.println("We are taking book");
    }
}
