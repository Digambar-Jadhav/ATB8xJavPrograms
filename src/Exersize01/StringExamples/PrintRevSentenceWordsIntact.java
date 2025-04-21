package Exersize01;

public class PrintRevSentenceWordsIntact {
    public static void main(String[] args) {
        String input = "I am java developer";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        //loop to add words
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0)
                result.append(" ");        //loop to add spaces
            }
            System.out.println(result);
        }

    }
//input="I am java developer";
//output="developer java am I";