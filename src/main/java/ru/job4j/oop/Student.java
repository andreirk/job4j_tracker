package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song(){
        System.out.println("I belive i can fly");
    }


    static void doCalc(byte... a) {
        System.out.print("byte...");
    }
    static void doCalc(Byte s1, Byte s2) {
        System.out.print("Byte, Byte");
    }
    static void doCalc(long a, long b) {
        System.out.print("long, long");
    }


    public static void main(String[] args) {
        Student petya = new Student();
        byte b = 5;
        doCalc(b, b);
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
