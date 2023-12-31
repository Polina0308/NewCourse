package aop;

import aop.Aspect.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UnivLibrary univlibrary = context.getBean("univLibrary", UnivLibrary.class);
        Book book = context.getBean("book", Book.class);

        univlibrary.getBook();
        univlibrary.addBook("Zaur", book);
        univlibrary.addMagazine();


//        univlibrary.ReturnMagazine();
//        univlibrary.addBook();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

//        univlibrary.ReturnBook();
//        univlibrary.getMagazine();

     context.close();
    }

}
