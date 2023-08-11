package aop.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Component
@Aspect
@Order(1)
public class LoggingAspect {


//    @Pointcut("execution(* aop.UnivLibrary.*(..))")
//    private void allMethodFromUnivLibrary(){}
//
//    @Pointcut("execution(public void aop.UnivLibrary.ReturnMagazine())")
//    private  void returnMagazineFrmUnivLibrary(){}
//
//    @Pointcut("allMethodFromUnivLibrary() && !returnMagazineFrmUnivLibrary()")
//    private  void allMethodsExceptReturnMagazineFromUnivLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUnivLibrary()")
//    public  void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
//    }






//@Pointcut("execution(* aop.UnivLibrary.get*())")
//    private  void allGetsMethodFromUnivLibrary(){}
//
//    @Pointcut("execution(* aop.UnivLibrary.Return*())")
//    private  void allReturnMethodFromUnivLibrary(){}
//
//    @Pointcut("allGetsMethodFromUnivLibrary() || allReturnMethodFromUnivLibrary()")
//    private  void  allGetsAndReturnMethodFromUnivLibrary(){}
//
//    @Before("allGetsAndReturnMethodFromUnivLibrary()")
//    public void beforeGetsAndReturnMethodFromUnivLibrary(){
//        System.out.println("beforeGetsAndReturnMethodFromUnivLibrary: writing Log#3");
//    }
//    @Before("allGetsMethodFromUnivLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodFromUnivLibrary()")
//    public void beforeReturnLoggingAdvice(){
//    System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//}


        @Before("aop.Aspect.MyPointcuts.allGetMethod()")
    public  void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
    }


}
