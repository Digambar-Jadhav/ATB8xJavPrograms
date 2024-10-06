package Sept.Task_23092024;
//Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
      //  Input. -
//choice - 1 - km → m, km → 1km
//choice - 2 - f → c, f → c
public class Task_23092024_018 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose from below:\n" +
                    "1: Kilometer to Miles\n" +
                    "2: Miles to Kilometer\n" +
                    "3: Celsius to Fahrenheit\n" +
                    "4: Fahrenheit to Celsius\n");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            double km = 0;
            double mil = 0;
            double cel = 0;
            double fh = 0;

            switch (choice) {
                case 1:
                    System.out.println("Kilometer to Miles conversion");
                    System.out.println("Enter distance in Kilometers: ");
                    km = sc.nextInt();
                    mil = km / 1.60934;  //miles=km/1.60934
                    System.out.println(km + " km = " + mil + " miles");
                    break;
                case 2:
                    System.out.println("Miles to Kilometer conversion");
                    System.out.println("Enter distance in Miles: ");
                    mil = sc.nextDouble();
                    km = (mil * 1.60934); //Km=miles*1.60934
                    System.out.println(mil + " miles = " + km + " Km");
                    break;
                case 3:
                    System.out.println("Celsius to Fahrenheit conversion");
                    System.out.println("Enter temperature in Celsius: ");
                    cel = sc.nextDouble();
                    fh = (cel * 1.8) + 32; //F=(C*9/5)+32
                    System.out.println(cel + " C = " + fh + " F");
                    break;
                case 4:
                    System.out.println("Fahrenheit to Celsius conversion");
                    System.out.println("Enter temperature in Fahrenheit: ");
                    fh = sc.nextDouble();
                    cel = (fh - 32) * 0.55555; //C=(F-32)*(5/9)
                    System.out.println(fh + " F = " + cel + " C");
                    break;
                default:
                    System.out.println("Invalid input...");
            }

        }
    }
