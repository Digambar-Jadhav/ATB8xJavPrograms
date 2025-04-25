package Exersize01.NumberMathExamples;

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int digitCount = countDigits(number);

        System.out.println("Number of digits: " + digitCount);
    }

    public static int countDigits(long num) {
        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Handle case where number is 0
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num =num/ 10;
            count++;
        }
        return count;
    }
}