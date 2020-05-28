package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLenght = left.length();
        int rightLength = right.length();
        int rsl = 0;
        int smallest = leftLenght < rightLength ? leftLenght : rightLength;

        for (int i = 0; i < smallest; i++) {
            if(left.charAt(i) > right.charAt(i)){
                return 1;
            } else if (left.charAt(i) < right.charAt(i)){
                return -1;
            }
        }

        if(rsl == 0 && leftLenght < rightLength){
            rsl = -1;
        }

        return rsl;
    }
}