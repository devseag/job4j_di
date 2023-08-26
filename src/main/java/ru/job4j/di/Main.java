package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Context context = new Context();
//        context.reg(ConsoleInput.class);
//        context.reg(StartUI.class);
//
//        StartUI ui = context.get(StartUI.class);
//
//        ui.print("question1: ");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("John Blinov");
        ui.add("Ivan ivanov");
        ui.print();
    }
}