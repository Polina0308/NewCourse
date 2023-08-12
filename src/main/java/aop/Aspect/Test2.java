package aop.Aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
        try {


        List <Student> students = university.getStudents();
        System.out.println(students); }
        catch (Exception o){
            System.out.println("Было поймано исключение " + o);
        }
        context.close();
    }
}
