package ru.job4j.di;

public class StartUI {

//    private ConsoleInput consoleInput;
//
//    public StartUI(ConsoleInput consoleInput) {
//        this.consoleInput = consoleInput;
//    }
//
//    public void print(String question) {
//        consoleInput.askStr(question);
//    }

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}