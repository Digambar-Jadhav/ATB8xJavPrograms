public class StringCaseConverter {
    public static void main(String[] args) {
        String input = "tEsTnG";
        String output = convertCasePositionally(input);
        System.out.println(output); // Output: TeStNg
    }

    public static String convertCasePositionally(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keep non-alphabet characters unchanged
            }
        }
        return result.toString();
    }
}