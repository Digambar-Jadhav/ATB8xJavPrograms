package Sept.Task_30092024;

import java.util.Scanner;

public class Task_30092024_003 {
    public static void main(String[] args) {
//Count vowels and consonants in a String. (Ajai) - v = 2 , c =. 4

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
       // String name = sc.nextLine();  // Read the input string
        String name = sc.nextLine();
        // Convert string to lowercase to handle both uppercase and lowercase letters
        //name = name.toLowerCase();
        name = name.toLowerCase();
        int vowelCount = 0, consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
//             Check if the character is a consonant (a letter that is not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}