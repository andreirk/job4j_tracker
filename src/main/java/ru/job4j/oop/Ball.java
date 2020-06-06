package ru.job4j.oop;

public class Ball {
    public void runFrom(Predator predator) {

    }

    public String isBeengAte(Predator by) {
        String result;
        if (by instanceof Fox) {
            result = "Лиса меня сьела!";
        } else {
            result = "Я от дедушки ущел и от бабушки ушел и от тебя " + by.getName() + " тоже уйду";
        }
        return result;
    }
}
