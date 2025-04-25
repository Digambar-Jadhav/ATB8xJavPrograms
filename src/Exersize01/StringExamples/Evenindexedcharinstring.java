package Exersize01.StringExamples;

public class Evenindexedcharinstring {
    public static void main(String[] args) {
        String str = "Automation";
        for (int i = 0; i < str.length(); i++)
        {
            if (i % 2 == 0) //to print even indexed
                // if(i%2!=0)// to print odd indexed char
            {
                System.out.print(str.charAt(i));

            }

        }
    }
}