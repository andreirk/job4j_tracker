package ru.job4j.oop;

public class Doctor extends Profession {

    public Diagnose heal(Pacient pacient) {
        String name = this.getName();
        return new Diagnose();
    }


}
