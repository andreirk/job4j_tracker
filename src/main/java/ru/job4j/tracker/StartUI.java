package ru.job4j.tracker;


public class StartUI {

    Input input;
    Tracker tracker;

    public void init(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt(""));
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
        String name = input.askStr("Enter name: ");
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
        String id = input.askStr("Enter item id to edit");
        Item item = tracker.findById(id);
        String newName = input.askStr("Enter new name");
        item.setName(newName);
        if(tracker.replace(id, item)){
            System.out.println("Successfully edited");
            return;
        } else {
            System.out.println("Something went wrong");
        };

    }
    private void deleteItem(){
        String id = input.askStr("Enter item id to delete");
        if(tracker.delete(id)){
            System.out.println("Successfully deleted");
            return;
        } else {
            System.out.println("Something went wrong");
        };

    }
    private void findItemById(){
        System.out.println();
        String id = input.askStr("Enter item id to find");
        Item item = tracker.findById(id);
        if(item != null){
            System.out.printf("Found item %s : %s", item.getId(), item.getName());
        } else {
            System.out.println("Not found");
        }
    }
    private void findItemsByName(){
        String name = input.askStr("Enter item name to find");
        Item item = tracker.findByName(name);
        if(item != null){
            System.out.printf("Found item %s : %s", item.getId(), item.getName());
        } else {
            System.out.println("Not found");
        }
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}