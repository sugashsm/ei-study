// File: FactoryMethodPattern/ElectricCarFactory.java
package FactoryMethodPattern;

// Concrete Creator for Electric Cars
public class ElectricCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}
