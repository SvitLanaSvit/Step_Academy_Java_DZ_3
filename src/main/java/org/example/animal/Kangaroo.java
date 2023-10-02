package org.example.animal;

public class Kangaroo extends Animal{
    public Kangaroo(String name, int age) {
        super(name, age, "Grassland");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Kangaroo eats plant-based foods.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Kangaroo makes various vocalizations.");
    }
}
