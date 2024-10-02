// File: SingletonPattern/Main.java
package SingletonPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Initial display of the configuration
        System.out.println("Initial Config: " + configManager.getConfigValue());  // Output: Default Config

        // Prompt the user for input
        System.out.println("Would you like to update the configuration value? (yes/no)");
        String userInput = scanner.nextLine().trim().toLowerCase();

        // Handle user input to update the config value
        if (userInput.equals("yes")) {
            System.out.print("Enter new configuration value: ");
            String newConfigValue = scanner.nextLine();
            configManager.setConfigValue(newConfigValue);
            System.out.println("Updated Config: " + configManager.getConfigValue());  // Output: New Config Value
        }

        // Verify that only one instance exists and display the current config
        ConfigurationManager anotherInstance = ConfigurationManager.getInstance();
        System.out.println("Config from another instance: " + anotherInstance.getConfigValue());  // Output: New Config Value

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
