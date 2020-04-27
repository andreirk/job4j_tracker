package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
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
        return index != -1 ? items[index] : null;
    }
    public Item findByName(String name) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
    public Item[] findAll(){
        int size = 0;
        Item[] result = new Item[this.items.length];
        for(int i = 0; i < result.length; i++){
            if(this.items[i] != null){
                result[size] = this.items[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item replace(String id, Item item){
        int index = indexOf(id);
        Item itemToReplace = findById(id);
        String oldId = itemToReplace.getId();
        item.setId(oldId);
        items[index] = item;
        return item;

    }
}