package Exersize01.NumberMathExamples;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num, rev=0,r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        while(num!=0)
        {
            r = num%10;
            rev = rev*10+r;
            num=num/10;
        }
        System.out.println("Reversed Number is : " +rev);
    }
}