package Exersize01;

public class ReverseonlypartofString {
        public static void main(String[] args) {
            String fullName = "Digambar Jadhav";

            // Split the name into first and last name
            String[] parts = fullName.split("\\s");    //use [] to store it in array
            String firstName = parts[0];
            String lastName = parts[1];

            // Reverse the last name
            String reversedLastName = new StringBuilder(lastName).reverse().toString();

            // Concatenate and print the result
            String result = firstName + " " + reversedLastName;
            System.out.println(result);
        }

}
