package ru.job4j.tracker;


import java.util.Arrays;
import java.util.List;

public class StartUI {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    public static void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        int idx = 0;
        for (UserAction action :actions) {
            System.out.println(idx++ + ". " + action.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validateInput = new ValidateInput(input);

        Tracker tracker = new Tracker();
        UserAction[] arrayOfActions = {
                new CreateAction(),
                new ShowAllAction(),
                new EditAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction()
        };
        List<UserAction> actions = Arrays.asList(arrayOfActions);
        new StartUI().init(validateInput, tracker, actions);
    }
}