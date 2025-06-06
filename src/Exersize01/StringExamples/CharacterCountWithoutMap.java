package Exersize01.StringExamples;

import java.util.Scanner;

public class CharacterCountWithoutMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] charCounts = new int[256]; // Array to store character frequencies (for ASCII characters)

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCounts[ch]++;
        }

        System.out.println("Character occurrences:");
        for (int i = 0; i <= charCounts.length-1; i++) {
                  if (charCounts[i] > 0){                                  //if (charCounts[i] ==0){ //to print all char
                System.out.println((char) i + " : " + charCounts[i]);        //if (charCounts[i] > 1){ //to print duplicate char
            }
        }
    }
}