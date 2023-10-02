package org.example.device;

public class Kettle extends Device{
    public Kettle(){
        super("Electric Kettle", "Capacity: 1.5 liters, Power: 1500W");

    }

    @Override
    public void makeSound() {
        System.out.println("Kettle sound: Boiling water noise.");
    }
}
