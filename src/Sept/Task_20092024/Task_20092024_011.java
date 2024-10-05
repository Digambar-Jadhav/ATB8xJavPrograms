package Sept.Task_20092024;

import java.util.Scanner;
//ternary Operators to handle multiple conditions.
//
//// Input → int score = 85
//
//// String grade →
//
////  score >= 90 → A
////  score >= 80 → B
////  score >= 70 → C
public class Task_20092024_011 {
    public static void main(String[] args) {
   float score;
        System.out.println("Enter the Percentage Score");
        Scanner sc = new Scanner(System.in);
        score = sc.nextFloat();
        String ScoreValue = score>=90?"A":(score>=80?"B":(score>=70?"C":"D"));
        System.out.println(ScoreValue);

    }
}
