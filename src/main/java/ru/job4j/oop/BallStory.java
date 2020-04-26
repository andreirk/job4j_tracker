package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox("лиса");
        Hare hare = new Hare("заяц");
        Wolf wolf = new Wolf("волк");

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }

}
