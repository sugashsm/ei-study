package CommandPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        RemoteControl remote = new RemoteControl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter command (on/off): ");
        String userInput = scanner.nextLine();

        // Execute based on user input
        if ("on".equalsIgnoreCase(userInput)) {
            remote.setCommand(lightOn);
            remote.pressButton();  // Output: Light is ON
        } else if ("off".equalsIgnoreCase(userInput)) {
            remote.setCommand(lightOff);
            remote.pressButton();  // Output: Light is OFF
        } else {
            System.out.println("Invalid command! Please enter 'on' or 'off'.");
        }

        // Optionally, ask the user if they want to undo the last command
        System.out.println("Do you want to undo the last command? (yes/no): ");
        String undoInput = scanner.nextLine();

        if ("yes".equalsIgnoreCase(undoInput)) {
            remote.pressUndo();  // Output: Light is ON if the last command was 'off' or vice versa
        }

        scanner.close();
    }
}
