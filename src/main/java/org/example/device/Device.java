package org.example.device;

public class Device {
    private String name;
    private String characteristics;

    public Device(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public void makeSound(){
        System.out.println("Device sound: [Device sound goes here]");
    }

    public void show(){
        System.out.println("The name of device: " + name);
    }

    public void getDesc(){
        System.out.println("Device description: " + characteristics);
    }
}
