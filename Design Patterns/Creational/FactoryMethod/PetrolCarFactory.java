// File: FactoryMethodPattern/PetrolCarFactory.java
package FactoryMethodPattern;

// Concrete Creator for Petrol Cars
public class PetrolCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new PetrolCar();
    }
}
