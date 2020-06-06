package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return new StringBuilder(14)
                .append("Нейзвестное слово")
                .append(": ")
                .append(eng)
                .toString();
    }

    public static void main(String[] args) {
        DummyDic dict = new DummyDic();
        System.out.println(dict.engToRus("capital"));
    }
}
