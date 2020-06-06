package ru.job4j.oop;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("Predator.Predator");
    }

    public Predator() {

    }

    public void tryEat(Ball ball) {
        System.out.println(ball.isBeengAte(this));
    }


}
