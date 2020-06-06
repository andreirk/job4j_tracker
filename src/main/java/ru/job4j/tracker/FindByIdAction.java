package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println();
        String id = input.askStr("Enter item id to find");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.printf("Found item %s : %s", item.getId(), item.getName());
        } else {
            System.out.println("Not found");
        }
        return true;
    }
}
