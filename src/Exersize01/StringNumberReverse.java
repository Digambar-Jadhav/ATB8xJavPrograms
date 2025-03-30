package Exersize01;

import java.util.Scanner;

public class StringNumberReverse {

    // Method to reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = scanner.nextLine();

        // Check if input is a number
        if (input.matches("-?\\d+")) {
            int number = Integer.parseInt(input);
            System.out.println("Reversed Number: " + reverseNumber(number));
        } else {
            System.out.println("Reversed String: " + reverseString(input));
        }

        scanner.close();
    }
}

