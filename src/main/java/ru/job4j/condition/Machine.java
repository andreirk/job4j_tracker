package ru.job4j.condition;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;

        int moneyToChange = money - price;
        int reminder;
        int numberOfCoins;
        byte indexInCoinsList = 0;
        byte currentIndexInResult = 0;

        while (moneyToChange > 0) {
            int currentCoinNominal = coins[indexInCoinsList];
            reminder = moneyToChange % currentCoinNominal;
            numberOfCoins = moneyToChange / currentCoinNominal;
            System.out.printf("Number of coins:%s is:%s and reminder is %s", currentCoinNominal, numberOfCoins, reminder);
            for (int i = 0; i < numberOfCoins; i++) {
                rsl[currentIndexInResult] = currentCoinNominal;
                // System.out.printf("Coin %s: %s \n", i, rsl[currentIndexInResult]);
                currentIndexInResult++;
                size++;
            }
            System.out.println("reminder - " + reminder);

            moneyToChange = reminder;
            indexInCoinsList++;
        }

        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine mash = new Machine();
        int[] result = mash.change(150, 35);
        System.out.println("Coins are: ");
        for (int i : result) {
            System.out.println(i);
        }

    }
}
