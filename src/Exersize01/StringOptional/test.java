package Exersize01.StringOptional;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String input = "TeStNg";
        String output=covertcaseposionally(input);
        System.out.println(output);
    }
    public static String covertcaseposionally(String input){
        StringBuilder result = new StringBuilder();
        for(char ch:input.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                result.append(Character.toUpperCase(ch));
            }
            else
            {
                result.append(ch);
            }

        }
        return result.toString();
    }
}
  
 
