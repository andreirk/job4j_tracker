package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name to find");
        Item item = tracker.findByName(name);
        if(item != null){
            System.out.printf("Found item %s : %s", item.getId(), item.getName());
        } else {
            System.out.println("Not found");
        }
        return true;
    }
}
