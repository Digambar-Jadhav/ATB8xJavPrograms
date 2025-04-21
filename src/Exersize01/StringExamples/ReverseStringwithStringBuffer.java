package Exersize01;

import java.util.Scanner;

public class ReverseStringwithStringBuffer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        sb.reverse().toString();

        // Display the reversed string
        System.out.println("Reversed string: " + sb);


        if (sb.equals(input)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");

        }

    }



    }
