package Exersize01;

import java.util.Scanner;

public class ReverseStringwithStringBuffer {

         public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringBuffer object and initialize it with the input string
        StringBuffer stringBuffer = new StringBuffer(input);

        // Reverse the string
        stringBuffer.reverse();

        // Display the reversed string
        System.out.println("Reversed string: " + stringBuffer.toString());

        // Close the scanner
        scanner.close();
    }
}