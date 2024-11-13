package Oct.Task_18102024;
//Calculate the length of the String - without using the length() function. String name =”Pramod”; →  6 , CharArray, for loop
public class Task1_Length_String {
    public static void main(String[] args) {
        String str = "Digambar_Jadhav";
        int length = 0;
        for(char c:str.toCharArray()){
            length++;
        }
        System.out.println("Length of string "+str+" is:"+length);
    }
}
