package Sept.Task_20092024;

import java.util.Scanner;
// Triangle Classifier
// // Write a program that classifies a triangle based on its side lengths.
//
//// Given three input values representing the lengths of the sides, determine
//
//// if the triangle is equilateral (all sides are equal),
//
//// isosceles (exactly two sides are equal), or
//
//// scalene (no sides are equal).
//
//// Use an if-else statement to classify the triangle.
//
//// side1, side2, side3 ->

public class Task_20092024_013 {
    public static void main(String[] args) {
        double side1,side2,side3;
        System.out.println("Enter the Triangle sides");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value for side1");
         side1 = sc.nextDouble();
        System.out.println("Enter the value for Side2");
        side2 = sc.nextDouble();
        System.out.println("Enter the value for Side3");
        side3 = sc.nextDouble();
        if(side1>=1 && side2>=1 && side3>=1){
            if(side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            }
                else if (side1==side2 || side2 == side3 || side3==side1) {
                System.out.println("Iso triangle");
            }
                    else
                        System.out.println("Scalene Triangle");
                    }
                    else {
                        System.out.println("Are you mad");
                    }
                }
            }

    //triangle classifier

// Always talkt o your interviews and give them extra
// . Edge you need to give them and if you can handle them
// Test Validation ->  special.
