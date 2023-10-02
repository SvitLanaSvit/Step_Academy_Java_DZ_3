package org.example.animal;

public class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age, "Jungle");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Tiger eats a meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Tiger roars loudly.");
    }
}