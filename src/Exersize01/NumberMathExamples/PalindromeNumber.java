package Exersize01.NumberMathExamples;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int temp=num;
        int rev = 0, r;
        while (num != 0) {
            r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        if (temp==rev) {
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }
    }
}