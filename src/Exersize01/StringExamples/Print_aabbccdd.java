package Exersize01.StringExamples;

public class Print_aabbccdd {
    public static void main(String[] args) {
        String input = "abcd";
        String output = appenddupchar(input);
        System.out.println("Input String  : "+input);
        System.out.println("Output String : "+output);
    }
    public static String appenddupchar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c: str.toCharArray())
        {
            result = result.append(c).append(c);
        }
        return result.toString();
}
}