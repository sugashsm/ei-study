// File: ObserverPattern/Client.java
package ObserverPattern;

// Concrete Observer
public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    // Prints the new stock price when the client is notified
    @Override
    public void update(double price) {
        System.out.println("Client " + name + " notified. New stock price: " + price);
    }
}
