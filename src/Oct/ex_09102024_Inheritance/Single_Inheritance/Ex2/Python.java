package Oct.ex_09102024_Inheritance.Single_Inheritance.Ex2;

public class Python extends Programming {
    // Is A Programming
    public Python(){
        System.out.println("DC");//Default Connstructor
    }
    void print(){
        System.out.println(author);
        System.out.println(version);
    }

}