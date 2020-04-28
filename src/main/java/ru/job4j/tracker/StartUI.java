package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    Scanner scanner;
    Tracker tracker;

    public void init(Scanner scanner, Tracker tracker) {
        this.scanner = scanner;
        this.tracker = tracker;
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            switch (select){
                case 0:
                    createItem();
                    break;
                case 1:
                    showAllItems();
                    break;
                case 2:
                    editItem();
                    break;
                case 3:
                    deleteItem();
                    break;
                case 4:
                    findItemById();
                    break;
                case 5:
                    findItemsByName();
                    break;
                case 6:
                    System.out.println("Exiting program");
                    run = false;
                    break;
                default:
                    System.out.println("No such command");

            }

            // if
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
        // добавить остальные пункты меню.
    }


    private void createItem(){
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
    }

    private void showAllItems(){
        Item[] items = tracker.findAll();
        int idx = 0;
        for (Item item: items
             ) {
            System.out.println(idx++ + ". " + item.getId() + " : " + item.getName());
        }
    }
    private void editItem(){
        System.out.println("Enter item id to edit");
        String id = scanner.nextLine();
        Item item = tracker.findById(id);
        System.out.println("Enter new name");
        String newName = scanner.nextLine();
        item.setName(newName);
        if(tracker.replace(id, item)){
            System.out.println("Successfully edited");
            return;
        } else {
            System.out.println("Something went wrong");
        };

    }
    private void deleteItem(){
        System.out.println("Enter item id to delete");
        String id = scanner.nextLine();
        if(tracker.delete(id)){
            System.out.println("Successfully deleted");
            return;
        } else {
            System.out.println("Something went wrong");
        };

    }
    private void findItemById(){
        System.out.println("Enter item id to find");
        String id = scanner.nextLine();
        Item item = tracker.findById(id);
        if(item != null){
            System.out.printf("Found item %s : %s", item.getId(), item.getName());
        } else {
            System.out.println("Not found");
        }
    }
    private void findItemsByName(){
        System.out.println("Enter item name to find");
        String name = scanner.nextLine();
        Item item = tracker.findByName(name);
        if(item != null){
            System.out.printf("Found item %s : %s", item.getId(), item.getName());
        } else {
            System.out.println("Not found");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}