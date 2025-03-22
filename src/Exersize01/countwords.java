package Exersize01;

public class countwords {
    public static void main(String[] args) {
        String words = "One Two Three Four Five";
        int countwords = words.split("\\s").length;
        System.out.println(countwords);
    }
}
