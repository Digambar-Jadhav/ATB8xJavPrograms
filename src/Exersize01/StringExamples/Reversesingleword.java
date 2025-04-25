package Exersize01.StringExamples;

import java.sql.SQLOutput;

public class Reversesingleword {
    public static void main(String[] args) {


    String input="ONE APPLE A DAY KEEPS DOCTOR AWAY";
    String wordtoreverse = "DOCTOR";
    String[] words=input.split(" ");
    StringBuilder result = new StringBuilder();
    for(String word: words)
    {
        if(word.equals(wordtoreverse))
        {
            result.append(new StringBuilder(word).reverse());
        }
        else
        {
            result.append(word);
        }
        result.append(" ");

    }
        System.out.println(result);
    }

}
