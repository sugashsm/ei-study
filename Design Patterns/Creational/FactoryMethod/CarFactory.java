// File: FactoryMethodPattern/CarFactory.java
package FactoryMethodPattern;

// Factory Class (Creator)
public abstract class CarFactory {
    public abstract Car createCar();

    public void testDriveCar() {
        Car car = createCar();
        car.drive();
    }
}
