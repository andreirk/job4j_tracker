package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {


        String[] leftArr = left.split("");
        String[] rightArr = right.split("");

        String leftStringToParse = "";
        int indexInLeft = 0;
        while (!leftArr[indexInLeft].equals(".")) {
            leftStringToParse += leftArr[indexInLeft];
            indexInLeft++;
        }
        String rightStringToParse = "";
        int indexInRight = 0;
        while (!rightArr[indexInRight].equals(".")) {
            rightStringToParse += rightArr[indexInRight];
            indexInRight++;
        }


        int intRight = Integer.parseInt(rightStringToParse);
        int intLeft = Integer.parseInt(leftStringToParse);
        return Integer.compare(intLeft, intRight);
    }
}