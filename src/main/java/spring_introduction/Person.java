package spring_introduction;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }


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
