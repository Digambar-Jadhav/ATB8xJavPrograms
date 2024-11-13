package Oct.Task_18102024;

import java.util.Scanner;

public class Task003_StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str= sc.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        //   System.out.println("Original string: "+str);
        System.out.println("Reverse string: "+reverse);
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Yes, Its a Palindrome");
        }
        else {
            System.out.println("No, Its not a Palindrome");
        }
    }
}