package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements  Pet{
    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void Say(){
        System.out.println("Meow");
    }
}
