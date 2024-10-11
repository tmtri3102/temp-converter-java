import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fah, cel;
        int choice;

        Scanner input = new Scanner(System.in);
        String continueChoice;
        do {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Pick a program: ");
            choice = input.nextInt();
//            while (choice < 1 || choice > 2) {
//                System.out.print("Pick a program: ");
//                choice = input.nextInt();
//            }
            switch (choice) {
                case 1:
                    System.out.print("Celsius: ");
                    cel = input.nextDouble();
                    System.out.println(cel + " celsius = " + celToFah(cel) + " fahreinheit.");
                    break;
                case 2:
                    System.out.print("Fahrenheit: ");
                    fah = input.nextDouble();
                    System.out.println(fah + " fahrenheit = " + fahToCel(fah) + " celsius.");
                    break;
                default:
                    System.out.print("Pick a program: ");
                    choice = input.nextInt();
                    break;
            }
            System.out.print("Do you want to reset? (Y/N): ");
            continueChoice = input.next();
        }
        while (continueChoice.equalsIgnoreCase("Y"));
        System.out.println("End of program.");

    }

    public static double celToFah(double cel) {
        return ((double) 9 / 5) * cel + 32;
    }
    public static double fahToCel(double fah) {
        return ((double) 5 / 9) * (fah - 32);
    }
}
