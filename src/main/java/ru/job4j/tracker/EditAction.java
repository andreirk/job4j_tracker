package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id to edit");
        Item item = tracker.findById(id);
        String newName = input.askStr("Enter new name");
        item.setName(newName);
        if (tracker.replace(id, item)) {
            System.out.println("Successfully edited");
            return true;
        } else {
            System.out.println("Something went wrong");
        }
        return false;
    }
}
