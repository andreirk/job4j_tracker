package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        int idx = 0;
        for (Item item: items
                ) {
            System.out.println(idx++ + ". " + item.getId() + " : " + item.getName());
        }
        return true;
    }
}
