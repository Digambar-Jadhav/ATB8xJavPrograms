package Sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        //GST=18.45;
        int course = 100;
        float GST = 18.45f;
        //int total_price2 = course+GST; // Narrowing - Implicit - JVM - Invalid
        float total_price = course+GST; // Widening - Implicit - JVM - Invalid
        System.out.println(total_price);


        int total_price1 = course+(int)GST; // Narrowing - Explicit - LOSS
        System.out.println(total_price1);

    }
}
