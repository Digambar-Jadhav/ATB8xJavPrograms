package Oct.ex_23102024;

public class Lab186_Try {
    public static void main(String[] args) {
        try {
            int c =  10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //  if (condition) // handling?
    }
}