package aop.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Component
@Aspect
public class LoggingAndSecurityAspect {


    @Pointcut("execution(* aop.UnivLibrary.*(..))")
    private void allMethodFromivLibrary(){}

    @Pointcut("execution(public void aop.UnivLibrary.ReturnMagazine())")
    private  void returnMagazineFrmUnivLibrary(){}

    @Pointcut("allMethodFromivLibrary() && !returnMagazineFrmUnivLibrary()")
    private  void allMethodsExceptReturnMagazineFromUnivLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUnivLibrary()")
    public  void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
    }






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

//    @Pointcut("execution(  * get*())")
//    private void allGetMethod(){}
//        @Before("allGetMethod()")
//    public  void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before ("allGetMethod()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }


}
