package Exersize01.StringExamples;

import java.util.Scanner;

public class StringReversewithPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();
        scanner.close();
        String nstr = " ";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            nstr = ch+nstr;

        }
        System.out.println("Reversed String :"+ nstr);
        if (nstr.equals(str)) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }

    }
}
