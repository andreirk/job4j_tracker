package ru.job4j.oop;

public class Animal {
    public Animal(String name){
        super();
        this.name = name;
        System.out.println("Animal.Animal");
    }

    public Animal(){

    }

    String name;

    public String getName(){
        return this.name;
    }
}
