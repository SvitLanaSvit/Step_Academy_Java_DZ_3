package org.example.device;

public class Microwave extends Device{

    public Microwave() {
        super("Microwave Oven", "Capacity: 800W, Digital Control");
    }

    @Override
    public void makeSound() {
        System.out.println("Microwave sound: Humming noise while heating.");
    }
}
