package Oct.Task_02102024_Task001;



public class ATBStud {

        String name;
        int roll_no;
        int admission_no;
        String class_name;
        char section;

    public static void main(String[] args) {
        ATBStud atb = new ATBStud();
        atb.name = "Digambar";
        System.out.println(atb.name);

        ATBStud atb1 = new ATBStud();
        atb1.roll_no = 9;
        System.out.println(atb1.roll_no);

        ATBStud atb2 = new ATBStud();
        atb2.admission_no = 654321;
        System.out.println(atb2.admission_no);

        ATBStud atb3 = new ATBStud();
        atb3.class_name = "Class-A";
        System.out.println(atb3.class_name);

        ATBStud atb4 = new ATBStud();
        atb4.section = 'A';
        System.out.println(atb4.section);

    }
}

