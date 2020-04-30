package ru.job4j.tracker;


public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public static void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        int idx = 0;
        for (UserAction action :actions) {
            System.out.println(idx++ + ". " + action.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new EditAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}