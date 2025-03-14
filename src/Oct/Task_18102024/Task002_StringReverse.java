package
        Oct.Task_18102024;
//Reverse the String without using any functions. (for loop)

import java.util.Scanner;

public class Task002_StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str= sc.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Original string: "+str);
        System.out.println("Reverse string: "+reverse);

        if(str.equals(reverse)){
            System.out.println("It is Palidrome");
        }
        else
        {
            System.out.println("It's Not Palindrome");
        }
    }
}