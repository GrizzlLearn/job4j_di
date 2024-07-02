package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

/**
 * @author dl
 * @date 02.07.2024 20:46
 */
public class ContextByListOfClasses {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class, StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
