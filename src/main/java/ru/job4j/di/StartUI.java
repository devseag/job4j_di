package ru.job4j.di;

public class StartUI {

    private ConsoleInput consoleInput;

    public StartUI(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public void print(String question) {
        consoleInput.askStr(question);
    }
}