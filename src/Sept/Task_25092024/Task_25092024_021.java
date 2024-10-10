package Sept.Task_25092024;

//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120

// n = 1 ->  Fact = 1*1 -> 1
// n = 3 -> Fact = 3*2*1 -> 6
import java.util.Scanner;

public class Task_25092024_021 {
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
}
