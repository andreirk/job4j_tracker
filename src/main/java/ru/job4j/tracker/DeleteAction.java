package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id to delete");
        if (tracker.delete(id)) {
            System.out.println("Successfully deleted");
            return true;
        } else {
            System.out.println("Something went wrong");
        }

        return false;
    }
}
