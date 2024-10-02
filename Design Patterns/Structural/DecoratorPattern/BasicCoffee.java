// File: DecoratorPattern/BasicCoffee.java
package DecoratorPattern;

// Concrete Component (Basic Coffee)
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
