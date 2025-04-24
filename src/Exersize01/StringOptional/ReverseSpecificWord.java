package Exersize01.StringExamples;


    public class ReverseSpecificWord {

        // Function to reverse a string
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        // Function to reverse a specific word in a sentence
        public static String reverseSpecificWord(String input, String wordToReverse) {
            String[] words = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                // Check if this word matches the target
                if (word.equals(wordToReverse)) {
                    result.append(reverse(word)).append(" ");
                } else {
                    result.append(word).append(" ");
                }
            }

            // Remove the trailing space
            return result.toString().trim();
        }

        public static void main(String[] args) {
            String input = "Java is a powerful language";
            String wordToReverse = "powerful";

            String output = reverseSpecificWord(input, wordToReverse);
            System.out.println("Original Sentence: " + input);
            System.out.println("Modified Sentence: " + output);
        }
    }

