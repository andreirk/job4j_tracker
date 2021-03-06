package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AttachmentFilter {

    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (func.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };


        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };

        return filter(list, func);
    }

    Comparator<String> cmpText = (left, right) -> {
        System.out.printf("compare left text: %s to right text: $s", left.length(), right.length());
        return left.compareTo(right);
    };

    Comparator<String> cmpDescSize = (left, right) ->  {
        System.out.printf("compare left length %s to right length $s", left.length(), right.length());
        return Integer.valueOf(left.length()).compareTo(Integer.valueOf(right.length()));
    };


}
