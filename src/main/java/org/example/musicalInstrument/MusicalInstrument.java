package org.example.musicalInstrument;

public class MusicalInstrument {
    private String name;
    private String characteristics;

    public MusicalInstrument(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public void makeSound(){
        System.out.println(name + " emits a beautiful musical sound.");
    }

    public void show(){
        System.out.println("The name of musical instrument: " + name);
    }

    public void getDesc(){
        System.out.println("Musical instrument description: " + characteristics);
    }

    public void getHistory(){
        System.out.println("Musical instrument history: [Musical instrument history is here]");
    }
}
