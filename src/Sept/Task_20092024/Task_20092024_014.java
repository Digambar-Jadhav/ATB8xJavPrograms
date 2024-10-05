package Sept.Task_20092024;

public class Task_20092024_014 {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100. However,
        // for multiples of 3, print "Fizz" instead of the number, and for multiples of 5,
        // print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        int n = 100;
        for (int i = 0; i <= n; i++)
        {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("FIzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }
    }
}