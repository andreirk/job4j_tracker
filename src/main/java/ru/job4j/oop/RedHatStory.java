package ru.job4j.oop;

public class RedHatStory {
    public static void main(String[] args) {
        Pioner petya = new Pioner();
        RedHatGirl girl = new RedHatGirl();
        Wolf wolf = new Wolf("wolf");

        girl.askForHelp(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
