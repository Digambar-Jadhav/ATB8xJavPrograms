package Sept.Task_16092024;

public class Task_16092024_005 {
    public static void main(String[] args) {
        //byte b = 10; long l = 10l; → How much Byte will be used.
        byte b = 10; // JVM will allocate 1 Byte for variable b.
        byte byte_memory = 1 ;
        long l = 10L; // JVM will allocate 8 Bytes for variable l.
        byte long_memory = 8 ;
        System.out.println("Memory allocation done by JVM for variables b & l : "+ (byte_memory+long_memory));
    }
    }


