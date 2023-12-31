package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.Say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.Say();
        context.close();
//        myDog.destroy();
//        yourDog.destroy();
    }
}
