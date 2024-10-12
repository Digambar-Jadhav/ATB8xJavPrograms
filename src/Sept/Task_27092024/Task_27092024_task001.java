package Sept.Task_27092024;

public class Task_27092024_task001 {

    //Give me example of while vs do while loop in Lab ex.

    public static void main(String[] args) {

        //while loop->init->condition->body->increment/decrement
        int a = 1;
        while (a <= 20) {
            System.out.println("The Number is: " + a);
            a++;
        }
        System.out.println("    ");
        //Do while loop->init->body->condition->increment/decrement

        int i = 0;
        do{
            System.out.println("Printing the Number" +i);
            i++;
        } while(i<=20);
    }


}