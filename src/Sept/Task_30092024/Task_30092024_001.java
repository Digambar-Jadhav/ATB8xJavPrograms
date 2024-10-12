import java.util.Scanner;

public static void main(String[] args) {
            double num,fact= 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number");
            num = sc.nextInt();

            for (double i = 1; i <=num; i++) {
                fact = fact * i;

            }
            System.out.println("Factorial of "+ num + " is  "+fact);
        }