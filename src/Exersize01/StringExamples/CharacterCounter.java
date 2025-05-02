package Exersize01.StringExamples;

    public class CharacterCounter {

        public static void main(String[] args) {
            String input = "Hello@123World!";

            int upper = 0, lower = 0, digit = 0, special = 0;

            for (char ch : input.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    upper++;
                    //System.out.println(ch);
                } else if (Character.isLowerCase(ch)) {
                    lower++;
                    //System.out.println(ch);
                } else if (Character.isDigit(ch)) {
                    digit++;
                    //System.out.println(ch);
                } else {
                    special++;
                   // System.out.println(ch);
                }
            }

            System.out.println("Uppercase letters: " + upper);
            System.out.println("Lowercase letters: " + lower);
            System.out.println("Digits: " + digit);
            System.out.println("Special characters: " + special);
        }
    }
