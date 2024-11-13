package Oct.Task_25102024;

import java.util.Scanner;
/*
Pyramid pattern in Java
     *
    ***
   *****
  *******
 *********
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars or numbers
            for (int k = 1; k <= (2 * i-1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        //Another way of doing using string repeat function
        /*for (int i = 1; i <= n; i++) {
            // Create spaces and stars using String.repeat()
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);

            // Print the current row of the pyramid
            System.out.println(spaces + stars);
        }*/
    }
}