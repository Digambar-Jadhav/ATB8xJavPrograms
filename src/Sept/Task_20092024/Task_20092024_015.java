package Sept.Task_20092024;

import java.util.Scanner;

public class Task_20092024_015 {
    public static void main(String[] args) {
        // year to be checked
        int year ;
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
            } else
            leap = false;

             if (leap)
            System.out.println(year + " is a leap year.");
             else
                 System.out.println(year + " is not a leap year.");
    }
}