package aop.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(  * acd*(..))")
    public void allAddMethod(){}
}
