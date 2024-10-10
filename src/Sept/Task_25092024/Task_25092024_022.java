package Sept.Task_25092024;
//Prime Number from 1 to 100. (for loop)
public class Task_25092024_022 {
    public static void main(String[] args) {

        int num = 100, counter;
        for (int i = 0; i <= 100; i++) {
            counter = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter++;  // Increment if 'i' is divisible by 'j'
                    break;
                }
            }
                if (counter == 0) {
                    System.out.println(i);
                }
        }
    }
}




