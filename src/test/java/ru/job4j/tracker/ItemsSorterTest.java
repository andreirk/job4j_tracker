package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemsSorterTest {

    @Test
    public void whenSortedDesc() {
        List<Item> items = Arrays.asList(new Item("1 item"), new Item("3 item"), new Item("2 item"));
        Collections.sort(items, ItemsSorter.sortByNameDesc());

        List<Item> expected =  Arrays.asList(new Item("1 item"), new Item("2 item"), new Item("3 item"));

        assertEquals("Done", items.get(1).getName(), expected.get(1).getName());
    }




}