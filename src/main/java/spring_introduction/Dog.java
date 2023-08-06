package spring_introduction;

public class Dog implements  Pet{
//    private  String name;
    public  Dog(){
        System.out.println("Dog been is created");
    }
    @Override
    public void Say(){
        System.out.println("Gav");
    }

    public  void init(){
        System.out.println("Class dog. Init method");
    }

    public void destroy(){
        System.out.println("Class dog. Destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
