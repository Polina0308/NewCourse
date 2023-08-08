package spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Dog implements  Pet{
//    private  String name;
    public  Dog(){
        System.out.println("Dog been is created");
    }
    @Override
    public void Say(){
        System.out.println("Gav");
    }

//    @PostConstruct
//    public  void init(){
//        System.out.println("Class dog. Init method");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class dog. Destroy method");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
