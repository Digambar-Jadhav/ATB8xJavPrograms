package Exersize01.StringExamples;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();                                  // Convert string to lowercase for easier comparison
        int vowelCount = 0;
        int consonantCount = 0;
        //extract char
        //for(char ch:input.toCharArray()){
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); //extract character
            if (Character.isLetter(ch)) { //use Character Wrapper Class                // Check if character is a letter
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    // Helper method to check for vowels
    public static boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}