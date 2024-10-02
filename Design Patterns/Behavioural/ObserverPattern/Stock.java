// File: ObserverPattern/Stock.java
package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Observable (Subject)
public class Stock {
    private String symbol;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    // Allows clients to subscribe to stock price updates
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Allows clients to unsubscribe from stock price updates
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Updates stock price and notifies all observers
    public void setPrice(double price) {
        this.price = price;
        notifyAllObservers();
    }

    // Notifies all subscribed observers about price change
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
