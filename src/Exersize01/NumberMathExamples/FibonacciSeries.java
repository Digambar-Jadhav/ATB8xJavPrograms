package Exersize01.NumberMathExamples;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms");
        int number=sc.nextInt();
        //int number = 6;
        int first = 0, second = 1, next;
        System.out.println("Fibonacci series is ");
        for (int i = 0; i <= number; i++) {
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }
    }
}