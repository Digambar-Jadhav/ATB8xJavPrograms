package Exersize01.NumberMathExamples;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtactnumfromStringandadd {
    public static void main(String[] args) {
            String input = "123abc2xyz123";
            int sum = 0;

            Pattern pattern = Pattern.compile("\\d+"); // Pattern to find one or more digits
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                sum =sum+ Integer.parseInt(matcher.group());
            }

            System.out.println("Sum is: " + sum); // Output: 248
        }
    }

