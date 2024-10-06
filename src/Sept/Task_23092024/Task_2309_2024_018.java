package Sept.Task_23092024;

import java.util.Scanner;

//Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//  Input. -
//choice - 1 - km → m, km → 1km
//choice - 2 - f → c, f → c
public class Task_2309_2024_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from Below:\n" +
                "1: Kilometer to Miles\n" +
                "2: Miles to Kilometer\n" +
                "3. Celsius to Fahrenheit\n" +
                "4: Fahrenheit to Celsius\n ");
        System.out.println("Please enter your choice:");
        int choice=0;
        choice= sc.nextInt();
        double km = 0;
        double mil = 0;
        double Cel = 0;
        double fah = 0;

        switch (choice){
        case 1 :
            System.out.println("Kilometer to Miles Conversion");
            System.out.println("Enter the distance in Kilometers:");
            km = sc.nextDouble();
            mil = km/1.60934;
            System.out.println(km+" Kilometers = "+mil+" Miles");
            break;
            case 2 :
                System.out.println("Miles to Kilometer Conversion");
                System.out.println("Enter the distance in Miles:");
                mil = sc.nextDouble();
                km = mil*1.60934;
                System.out.println(mil+" Miles = "+km+" Kilometers");
                break;
           case 3 :
               System.out.println(" Celsius to Fahrenheit Conversion");
               System.out.println("Enter the temperature in Celsius :");
               Cel = sc.nextDouble();
               fah = (Cel*1.8) + 32; //F=(C*9/5)+32
               System.out.println(Cel+" Celsius= "+fah+" Fahrenheit");
               break;
            case 4:
                System.out.println(" Fahrenheit to Celsius Conversion");
                System.out.println("Enter the temperature in Fahrenheit :");
                fah = sc.nextDouble();
                Cel = (fah-32)*0.5555555 ; //F=(C*9/5)+32
                System.out.println(fah+" Fahrenheit= "+Cel+" Celsius");
                break;
            default:
                System.out.println(" Enter correct values");


    }
}
}

