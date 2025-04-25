package Exersize01.StringExamples;

public class RemovespacefromString {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String str = "one two three four five";


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i)).toString();
            }

        }
        System.out.println(result);

    }
}
