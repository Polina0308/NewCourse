package aop.Aspect;

//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//@Aspect
//public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public  void beforeStudentsLoggingAdvice(){
//        System.out.println("beforeStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public  void afterReturningStudentsLoggingAdvice(List <Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade= firstStudent.getAvgGrade();
//        avgGrade= avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents");
//    }

//    @AfterThrowing(value = "execution(* getStudents())", throwing =  "exception")
//    public  void afterThrowingStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingStudentsLoggingAdvice: логируем исключение " + exception);
//    }

//    @After("execution(* getStudents())")
//    public void afterStudentsLoggingAdvice(){
//        System.out.println("afterStudentsLoggingAdvice: логируем нормальную работу метода или исключение");
//    }
//    }
