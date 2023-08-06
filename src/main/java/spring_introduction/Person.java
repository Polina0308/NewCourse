package spring_introduction;

public class Person {

    private Pet pet;
    private  String surname;
    private int age;

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

//    public Person(Pet pet) {
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person been is created");
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
