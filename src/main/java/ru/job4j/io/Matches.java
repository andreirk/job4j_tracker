package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int numOfMatches = 11;
        System.out.println("Game is started");
        while (run) {
            System.out.println("Введите количество спичек.");

            int select = Integer.valueOf(input.nextLine());
            numOfMatches -= select;
            if (numOfMatches > 0) {
                System.out.printf("Количество оставшихся спичек: %s", numOfMatches);
                System.out.println();
                System.out.println("Следующий ход.");
            } else {
                System.out.println("Вы выйграли");
                run = false;
            }
            System.out.println();
        }
    }
}
