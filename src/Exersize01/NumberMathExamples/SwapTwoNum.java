package Exersize01.NumberMathExamples;
//Swap two number without using third variable
public class SwapTwoNum {
    public static void main(String[] args) {
        int a=5;
        int b=6;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
