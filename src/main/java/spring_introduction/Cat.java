package spring_introduction;

public class Cat implements  Pet{
    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void Say(){
        System.out.println("Meow");
    }
}
