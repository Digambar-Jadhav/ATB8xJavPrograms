package Sept.Task_23092024;

import java.util.Scanner;
public class Task_23092024_016 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter the numbers to perform calculation");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Enter the Operator:");
        char op=sc.next().charAt(0);
        int res=0;
        switch (op) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Operator! Please enter correct operator");
                break;


        }
    }
}
