package org.example.animal;

public class Animal {
    private String name;
    private int age;
    private String habitat;

    public String getName() {
        return name;
    }

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public String toString() {
        return "Name:    " + name +
        "\nAge:     " + age + " years" +
        "\nHabitat: " + habitat;
    }
}
