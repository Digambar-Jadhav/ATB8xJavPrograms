package Exersize01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();
        scanner.close();



//        StringBuffer sb = new StringBuffer(input);
//        String a= String.valueOf(sb.reverse());
//        System.out.println("Reversed String:"+ " "+ a.toString());
         String nstr = " ";
         char ch=0;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch+nstr;

        }
        System.out.println(nstr);

    }
}
