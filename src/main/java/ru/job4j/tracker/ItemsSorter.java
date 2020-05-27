package ru.job4j.tracker;

import java.util.Comparator;

public class ItemsSorter {

    static class SortByNameDesc implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    static class SortByNameAsc implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {
            return o1.getName().compareTo(o2.getName()) * -1;
        }
    }

    public static SortByNameDesc sortByNameDesc(){
        return new SortByNameDesc();
    }
    public static SortByNameAsc sortByNameAsc(){
        return new SortByNameAsc();
    }
}

