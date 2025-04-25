package Exersize01.StringExamples;

import java.util.Scanner;

public class ReverseStringwithStringBuffer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder(input);
        result.reverse().toString();

        // Display the reversed string
        System.out.println("Reversed string: " + result);


        if (result.equals(input)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");

        }

    }



    }
