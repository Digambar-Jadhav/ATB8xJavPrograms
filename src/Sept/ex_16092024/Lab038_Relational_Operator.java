package Sept.ex_16092024;

public class Lab038_Relational_Operator {
    public static void main(String[] args) {
        //relational operator result will always be in boolean
        //<, >, <=, >=, !=,! => True or False
        int a = 10;
        int b = 30;
        boolean c = b > a; //true
        System.out.println(c);
        int Age_Anita = 32;
        int Age_Digambar = 35;
        boolean result = Age_Anita > Age_Digambar; //False
        System.out.println(result);
        boolean result1 = Age_Digambar > Age_Anita; //true
        System.out.println(result1);


    }
}
