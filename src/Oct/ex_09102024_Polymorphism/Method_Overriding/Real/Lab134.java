package Oct.ex_09102024_Polymorphism.Method_Overriding.Real;

public class Lab134 {

        public static void main(String[] args) {
//        Pramod p = new Pramod();
//        p.home();
//
//        Father f  = new Father();
//        f.home();
//

            // Dynamic Dispatch
            Father object = new Pramod();
            object.home();

            // WebDriver driver = new ChromeDriver();

            // Not possible
            // Pramod object = new Father();

        }
    }
