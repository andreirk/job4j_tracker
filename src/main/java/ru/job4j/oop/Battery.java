package ru.job4j.oop;

public class Battery {
    private int power;

    public Battery(int power) {
        this.power = power;
    }

    public void exchange(Battery another) {
        another.power += this.power;
        this.power = 0;
    }
}
