package Oct.ex_04102024;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    // Default Constructor
    Dog(){
        System.out.println("I am DC");
        System.out.println("God is happy!");
    }


    Dog(String breed){
        System.out.println("I am German Shepherd");
        this.breed = breed;
    }

    Dog(String breed,String name,int age, int legs){
        System.out.println("I am German Shepherd");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }



    void walk(){
    }
}