package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items.get(index) : null;
    }
    public Item findByName(String name) {
        Item rsl = null;
        for (Item item : items) {
            if(item.getName() == name){
                rsl = item;
            }
        }

        return rsl;
    }
    public Item[] findAll(){
        return this.items.toArray(Item[]::new);
    }
    private int indexOf(String id) {
        int rsl = -1;
        int index = 0;
        for (Item item : items) {
            if(item.getId() == id){
                rsl = index;
            }
            index++;
        }
        return rsl;
    }

    public boolean replace(String id, Item item){
        int index = indexOf(id);
        if(index == -1){
            System.out.println("Can't find this index");
            return false;
        }
        Item itemToReplace = findById(id);
        String oldId = itemToReplace.getId();
        item.setId(oldId);
        items.set(index, item);
        return true;
    }

    public boolean delete(String id) {
        boolean removed = items.remove(id);
        return  removed;
    }
}