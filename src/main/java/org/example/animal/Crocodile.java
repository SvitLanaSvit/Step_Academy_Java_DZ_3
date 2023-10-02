package org.example.animal;

public class Crocodile extends Animal{

    public Crocodile(String name, int age) {
        super(name, age, "Swamp");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Tiger eats a meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Crocodile hisses.");
    }
}
