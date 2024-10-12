package Sept.Task_30092024;

public class Task_30092024_002 {
    public static void main(String[] args)
    {

        int num = 100, counter;
        for (int i = 0; i <= 100; i++)
        {
            counter = 0;
            for (int j = 2; j < i / 2; j++)
            {
                if (i % j == 0)
                {
                    counter++; // Increment if 'i' is divisible by 'j'
                    break;
                }
            }
                if (counter == 0)
                {
                    System.out.println(i);

                }
            }

        }
    }

