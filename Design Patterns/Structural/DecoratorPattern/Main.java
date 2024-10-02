package DecoratorPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start with Basic Coffee
        Coffee coffee = new BasicCoffee();

        System.out.println("Your basic coffee is ready: " + coffee.getDescription() + " $" + coffee.getCost());

        // Ask user if they want to add milk
        System.out.print("Do you want to add milk? (yes/no): ");
        String addMilk = scanner.nextLine();
        if (addMilk.equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        // Ask user if they want to add sugar
        System.out.print("Do you want to add sugar? (yes/no): ");
        String addSugar = scanner.nextLine();
        if (addSugar.equalsIgnoreCase("yes")) {
            coffee = new SugarDecorator(coffee);
        }

        // Final output
        System.out.println("Your final coffee order: " + coffee.getDescription() + " $" + coffee.getCost());

        scanner.close();
    }
}
