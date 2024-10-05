package Sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        //functions
        //1. Without return type without parameters
        function_type1();
        //2. with return type without parameters
       int age = function_type2();
        System.out.println("age");
        //3. with parameters with return type
        function_type3 (12,"Digambar", "Anvi", 07);
        //With Parameter without return type
        double result = function_type4(3,4);

    }
    //1. Without parameters without return type
    private static void function_type1() {
        System.out.println("Without Parameter Without Return Type");
    }
    //2. without parameters with return type
    public static int function_type2(){
        System.out.println("Without Parameter With Return Type");
        return 07;
    }
    //3. with parameters with return type
    public static void function_type3(int age, String name, String name2, int age2 ){
        System.out.println("With Parameter Without Return Type");
        System.out.println("You have shared ->" +name);
    }
    //4. with return type with parameters
    public static double function_type4(int a, double b){
        System.out.println(" With Parameter With Return Type");
        return a+b;

    }
}
