package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.setName("Link");
        
        Dog dog = new Dog();
        dog.setName("Rover"); // inherited method
        dog.setBreed("German Shepherd");
        dog.bark();
    }
}