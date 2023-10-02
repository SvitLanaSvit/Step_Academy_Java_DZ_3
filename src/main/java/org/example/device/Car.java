package org.example.device;

public class Car extends Device{
    public Car() {
        super("Sedan Car", "Fuel: Petrol, 4 Doors");
    }

    @Override
    public void makeSound() {
        System.out.println("Car sound: Engine running and tires on the road.");
    }
}
