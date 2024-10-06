package Sept.Task_25092024;

//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120

// n = 1 ->  Fact = 1*1 -> 1
// n = 3 -> Fact = 3*2*1 -> 6
import java.util.Scanner;

public class Task_25092024_021 {
    public static void main(String[] args) {
        int number = 0,fact= 1;
        int i;

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (i = 1; i <=number; i++) {
            fact = fact * number;
            number--;
        }
        System.out.println(fact);
    }
}
