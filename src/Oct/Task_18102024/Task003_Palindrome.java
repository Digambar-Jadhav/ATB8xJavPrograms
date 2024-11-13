package Oct.Task_18102024;

import java.util.Scanner;

public class Task003_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}