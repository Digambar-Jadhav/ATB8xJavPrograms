package Oct.ex_09102024_Inheritance.Single_Inheritance.Ex1;


public class Son extends Father {
    // Son -> Father


    void bhk3(){
        System.out.println("3BHK");
        // Attribute Father
        System.out.println(gold_f);
        // Behaviour
        bhk2();
    }
}