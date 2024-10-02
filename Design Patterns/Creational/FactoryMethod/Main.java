package FactoryMethodPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of car to test drive:");
        System.out.println("1. Electric Car");
        System.out.println("2. Petrol Car");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        CarFactory carFactory = null;

        switch (choice) {
            case 1:
                carFactory = new ElectricCarFactory();
                break;
            case 2:
                carFactory = new PetrolCarFactory();
                break;
            default:
                System.out.println("Invalid choice! Exiting.");
                scanner.close();
                return; // Exit if the choice is invalid
        }

        // Test drive the selected car
        carFactory.testDriveCar();

        scanner.close();
    }
}
