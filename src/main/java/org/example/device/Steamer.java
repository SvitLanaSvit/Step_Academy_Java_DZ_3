package org.example.device;

public class Steamer extends Device{
    public Steamer() {
        super("Steamboat", "Steam Engine, Passenger Vessel");
    }

    @Override
    public void makeSound() {
        System.out.println("Steamboat sound: Steam engine churning and water splashing.");
    }
}
