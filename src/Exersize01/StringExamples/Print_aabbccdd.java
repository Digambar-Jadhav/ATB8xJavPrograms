package Exersize01;

public class Print_aabbccdd {
    public static void main(String[] args) {
        String input = "abcd";
        String output = appendduplicateCharacters(input);
        System.out.println("Input String  : "+input);
        System.out.println("Output String : "+output);
    }
    public static String appendduplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (char c: str.toCharArray())
        {
            result = result.append(c).append(c);
        }
        return result.toString();
}
}