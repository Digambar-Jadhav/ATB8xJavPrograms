package Exersize01.StringExamples;

public class ReverseSpecificPhrase {
    public static void main(String[] args) {
        String input = "I am java developer";
        String target = "java developer";

        if (input.contains(target)) {
            // Reverse the target phrase
            String reversed = new StringBuilder(target).reverse().toString();
            // Replace only the first occurrence
            input = input.replaceFirst(target,reversed);
        }

        System.out.println(input);
    }
}