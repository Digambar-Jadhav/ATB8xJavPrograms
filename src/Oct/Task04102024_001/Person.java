package Oct.Task04102024_001;

public class Person {
    // Create a Person Class with 10 A, 5 Behaviour( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects.

    //Instance variables  (Attributes)
String Name;
String Address;
int Age;
char Gender;
String City;
String Country;
String State;
double Height;
double Weight;
String Occupation;
String ID_Proof;

    // Default Constructor (DC)
Person(){

}
    // Parameter Constructor (PC 1)
Person(String Name,String City, String State, String Country){
    System.out.println("This is a parameter Constructor\n");
    this.Name=Name;
    this.City=City;
    this.State=State;
    this.Country=Country;

}
    // Parameter Constructor (PC 2)
Person(char Gender,int Age, Double Height, Double Weight){
    this.Gender=Gender;
    this.Age=Age;
    this.Height=Height;
    this.Weight=Weight;

}
    // Parameter Constructor (PC 3)
Person(String ID_Proof, String Occupation, String Address){
    this.Occupation=Occupation;
    this.ID_Proof=ID_Proof;
    this.Address=Address;

}
    // Behavior 1 (Non-Return Type)
    void walk(){
        System.out.println("This is Walk Method");
    }

    // Behavior 2 (Default Return Type)
    void talk(){
    String talk;
    }
    // Behavior 3 (Return Type without invoking object)
public static String eat(String Food, String Drink){
    System.out.println("This is eat method:"+("I had "+Food+" and drank "+Drink));
    return (Food+Drink);
    }
    // Behavior 4 (Non-Return-Type without invoking object)
public static void work(String Hardwork, String Earn){
    System.out.println("This is work Method:"+Hardwork+Earn);
}
    // Behavior 5 (Return-Type)
public String sleep(){
    return "This is Sleep Method";
}
    // Behavior 6 (Return-Type)
    public String live() {
        return "This is live Method";
    }
    public static void main(String[] args) {
        // Create Object and call DC
        Person DC = new Person();
        new Person();

        // Create Object and call PC1
        Person PC1 = new Person("Digambar","Sangli","Maharashtra","India");
        System.out.println("This is PC1:my Name is "+PC1.Name);
        System.out.println("This is PC1:my City is "+PC1.City);
        System.out.println("This is PC1:my State is "+PC1.State);
        System.out.println("This is PC1:my Country is "+PC1.Country+"\n");

        // Create Object and call PC2
        Person PC2 = new Person('M',30, 5.3, 65.0);
        System.out.println("This is PC2: Gender is "+PC2.Gender);
        System.out.println("This is PC2: Age is "+PC2.Age);
        System.out.println("This PC2: Hieght is "+PC2.Height);
        System.out.println("This is PC2: Weight is "+PC2.Weight+"\n");

        // Create Object and call PC3
        Person PC3 = new Person("QA Engineer","Aadhar_Card","Address");
        System.out.println("This is my Occupation: "+PC3.Occupation);
        System.out.println("This is my ID Proof "+PC3.ID_Proof);
        System.out.println("This is my Adress: "+PC3.Address+"\n");
         // Create Object and call PC4

        // Behaviour 1
        // Behaviour 1
        Person Walk = new Person();
        Walk.walk();
        // Behaviour 2
        Person Talk = new Person();
        String Tlk = "I am an Automation Test Engineer";
        System.out.println("This is talk Method:"+Tlk);

        // Behaviour 3
        eat("Meals","Water");

        // Behaviour 4
        work("Hardwork done","Earned salary");

        // Behaviour 5

        Person Sleep = new Person();
        String Slp = Sleep.sleep();
        System.out.println(Slp);

        // Behaviour 6

        Person Live = new Person();
        Live.live();
        String Liv = Live.live();
        System.out.println(Liv);
    }
}
