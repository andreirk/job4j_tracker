package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String[] answers = {"Да", "Нет", "Может быть"};
        String question = input.nextLine();
        int answerIndex = new Random().nextInt(3);
        System.out.printf("Чтоже ты спрашиваешь меня %s  и я великий ораккул отвечаю: %s", question, answers[answerIndex]);
    }
}
