package Exersize01.StringExamples;

import java.util.Scanner;
public class ExtractStringandNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original String is: "+ input);
        separateAlphaAndNumeric(input);
    }
    public static void separateAlphaAndNumeric(String input)
    {
        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        for(char ch : input.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                alphaPart.append(ch);
            }
            else if (Character.isDigit(ch))
            {
                numericPart.append(ch);
            }
        }
        System.out.println("Output in Alpha: "+alphaPart.toString());
        System.out.println("Output in Numeric: "+numericPart.toString());
    }
}