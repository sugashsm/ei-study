// File: CommandPattern/RemoteControl.java
package CommandPattern;

// Invoker class (triggers the commands)
public class RemoteControl {
    private Command command;

    // Sets the command
    public void setCommand(Command command) {
        this.command = command;
    }

    // Executes the command
    public void pressButton() {
        command.execute();
    }

    // Undoes the last command
    public void pressUndo() {
        command.undo();
    }
}
