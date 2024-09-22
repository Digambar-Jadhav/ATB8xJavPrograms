package Sept.ex_18092024;

public class Lab053 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post
        // Ready

//        // pre - increment - ++operand.
//        // value is incremented first and then stored in the result.
       int a  = 10;
        System.out.println(a);
       int b  = ++a; // a = a+1
        System.out.println(b);
        System.out.println(a);// increase first then print
//        //  | a |output (b)|
//        //   10
//        //   11 | 11
//        System.out.println(b);
//        System.out.println(a);

//        int a = 10;
//        System.out.println(++a);
//        System.out.println(a);

        // Post  a++

        int a_post = 10;
        System.out.println(a_post++); // Print first and then increase
        System.out.println(a_post);



    }
}
