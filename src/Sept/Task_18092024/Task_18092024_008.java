package Sept.Task_18092024;

public class Task_18092024_008 {
    public static void main(String[] args) {
        //
       int a = 10;
       long b = a; //implicit casting
        long e = 10;
        int f = (int) e;//explicit casting
        int c = 20;
        byte d = (byte)e;

        // Type Casting
        //Widening with Implicit and Explicit Type Casting
        byte val = 15;
        int val1 = val;// Valid Implicit catsing
        int val2 = (int)val;//valid expilcit casting
        /*


        // Narrowing with implicit and explicit.
        int value = 200;
        byte value1 = (byte)value;
        System.out.println(value1); // loss

        // Widening
        int course = 100;
        float gst = 18.5f;

        int result = course+(int)gst;
        float result1 = (float)course+gst;
        float res = course+gst; // implicitly accepting by float over int even both have 32 bit memory
        System.out.println(result); //118 loss
        System.out.println(result1); // 118.5
        System.out.println(res); // 118.5

        // another example1:
        long course1 = 100;
        float gst1 = 18.5f;
        float result2 = course1+gst1; // float has upper hand due to its fractional acceptance
        // even though it is 32 bit java accepts float precision compare to long 64 bit
        float result3 = (float)course+gst;

        // another example 2:
        float price_full = 100;
        double price_gst = 18.5;
        //  float total = price_full+price_gst; not acceptable implicit narrowing
        double result4 = price_full+price_gst; // widening implicit
        double result5 = (double)price_full+price_gst; // widening implicit
        float result6 = price_full+ (float)price_gst; // narrowing explicit

        System.out.println("double implicit:" +result4);
        System.out.println("double explicit:" +result5);
        System.out.println("float explicit:" +result6);

    }
}
