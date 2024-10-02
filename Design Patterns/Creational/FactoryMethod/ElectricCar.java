// File: FactoryMethodPattern/ElectricCar.java
package FactoryMethodPattern;

// Concrete Product
public class ElectricCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an electric car.");
    }
}
