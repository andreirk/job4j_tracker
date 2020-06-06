package ru.job4j.ex;

public class FactRec {
    public static long calc(int n) {
        if (n <= 1) {
            return 1;
        }
        return calc(n - 1) * n;
    }

    public static void main(String[] args) {
        long rsl = calc(10);
        System.out.println(rsl);
    }
}