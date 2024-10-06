package Sept.Task_23092024;

import java.util.Scanner;
//Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
//Input  - 12
//Out - Dec
public class Task_23092024_017 {
    public static void main(String[] args) {
        int month;
        System.out.println("Enter the Month in the Year");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("Month: Jan");
                break;
            case 2:
                System.out.println("Month: Feb");
                break;
            case 3:
                System.out.println("Month: Mar");
                break;
            case 4:
                System.out.println("Month: Apr");
                break;
            case 5:
                System.out.println("Month: May");
                break;
            case 6:
                System.out.println("month: Jun");
                break;
            case 7:
                System.out.println("Month: Jul");
                break;
            case 8:
                System.out.println("Month: Aug");
                break;
            case 9:
                System.out.println("Month: Sep");
                break;
            case 10:
                System.out.println("Month: Oct");
                break;
            case 11:
                System.out.println("Month: Nov");
                break;
            case 12:
                System.out.println("Month: Dec");
                break;
            default:
                System.out.println("Enter Valid Month Details");
                break;

        }
    }
}
