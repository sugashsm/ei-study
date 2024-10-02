package ObserverPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting for stock symbol and initial price
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.nextLine();

        System.out.print("Enter initial stock price: ");
        double initialPrice = scanner.nextDouble();

        Stock stock = new Stock(symbol, initialPrice);

        // Creating clients
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        // Clients subscribe to stock price updates
        stock.addObserver(client1);
        stock.addObserver(client2);

        // Prompt for the number of updates
        System.out.print("How many price updates would you like to make? ");
        int updatesCount = scanner.nextInt();

        // Loop to update stock price based on user input
        for (int i = 0; i < updatesCount; i++) {
            System.out.print("Enter new stock price: ");
            double newPrice = scanner.nextDouble();
            stock.setPrice(newPrice); // Notifies all observers
        }

        // Close the scanner
        scanner.close();
    }
}
