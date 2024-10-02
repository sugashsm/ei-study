// File: FactoryMethodPattern/PetrolCar.java
package FactoryMethodPattern;

// Concrete Product
public class PetrolCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a petrol car.");
    }
}
