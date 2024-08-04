package bg.softuni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to the converter");
        System.out.println("Choose option");
        System.out.println("1. Cm To Inches");
        System.out.println("2. Inches To Cm");
        System.out.println("3. Meters To Feet");
        System.out.println("4. Feet To Meters");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number you want to convert");
        double convertInput = Double.parseDouble(scanner.nextLine());

        switch (number) {
            case 1:
                double cmToInches = cmToInches(convertInput);
                System.out.printf("%.2f cm to inches: %.2f%n", convertInput, cmToInches);
                break;
            case 2:
                double inchesToCm = inchesToCm(convertInput);
                System.out.printf("%.2f inches to cm: %.2f%n", convertInput, inchesToCm);
                break;
            case 3:
                double metersToFeet = metersToFeet(convertInput);
                System.out.printf("%.2f meters to feet: %.2f%n", convertInput, metersToFeet);
                break;
            case 4:
                double feetToMeters = feetToMeters(convertInput);
                System.out.printf("%.2f feet to meters: %.2f%n", convertInput, feetToMeters);
                break;
            default:
                System.out.println("Invalid option selected");
        }

        scanner.close();
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }

    public static double cmToInches(double cm) {
        return cm * 0.393;
    }

    public static double metersToFeet(double meters){
        return meters * 3.28;
    }

    public static double feetToMeters(double feet){
        return feet * 0.3048;
    }
}
