// File: CommandPattern/Light.java
package CommandPattern;

// Receiver class (the one that does the actual work)
public class Light {
    public void on() {
        System.out.println("Light is ON");
    }

    public void off() {
        System.out.println("Light is OFF");
    }
}
