package aop.Aspect;

import aop.UnivLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("Method main starts");

        UnivLibrary univLibrary = context.getBean("univLibrary", UnivLibrary.class);
        String bookName = univLibrary.ReturnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);

        context.close();

        System.out.println("Method main ends");
    }

}
