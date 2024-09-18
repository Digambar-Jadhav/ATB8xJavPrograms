package Sept.ex_13092024;

public class Lab024 {
    public static void main(String[] args) {
        // Literals
        // Boolean
        // Integral

        // Char
        //  Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Digambar"+ new_line +  "Jadhav");
        System.out.println("Digambar"+ '\n' +  "Jadhav");
        System.out.println("Digambar"+ tab_line +  "Jadhav");
        System.out.println("Digambar"+ back_space +  "Jadhav");
        System.out.println("Digambar"+ car_r +  "Jadhav");

        char c11  = '\u1F60'; //65 - ASCII
        // chinese - india, japense -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :)

    }
}
