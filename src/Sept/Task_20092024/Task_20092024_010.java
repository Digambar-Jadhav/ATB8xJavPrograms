package Sept.Task_20092024;
//By using Ternary Operators max between 3 numbers.

// Input int - a,b,c - a = 10, b = 20, c = 45

// Max → a,b,c → c

import java.util.Scanner;

public class Task_20092024_010 {
    public static void main(String[] args) {
    int a, b,c;
        System.out.println(" Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max_value = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("the max value is "+max_value);

    }

}
