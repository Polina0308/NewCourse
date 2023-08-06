package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;
    private  String surname;
    private int age;

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person been is created");
        this.pet = pet;
    }

//    public Person() {}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class surname: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class age: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    public  void callYouretPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.Say();
    }


}
