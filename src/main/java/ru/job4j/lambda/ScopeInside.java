package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
//        for (int i = 0; i < number.length; i++) {
//            int num = i;
//            total = add(
//                    () -> {
////                        int totalCopy = total;
////                        return Integer.valueOf(totalCopy) + num;
//                    }
//            );
//        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }


    public  static List<Double> diapason(int start, int end, Function<Double, Double> func) {

        List<Double> rsl = new ArrayList<>();
        for (Double i = Double.valueOf(start); i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }



}