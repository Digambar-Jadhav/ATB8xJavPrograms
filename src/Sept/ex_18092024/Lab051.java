package Sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no =993837099876543210l;
            //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
            short s1 = (short)phone_no;
        System.out.println(s1);// Narrowing - Explicit - Loss // Invalid
        }
    }
