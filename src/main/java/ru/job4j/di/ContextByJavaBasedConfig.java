package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.model.StartUI;

/**
 * @author dl
 * @date 02.07.2024 20:56
 */
public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.di.model");
        var ui = context.getBean(StartUI.class);
        ui.add("Name Surname");
        ui.add("Name1 Surname1");
        ui.print();
    }
}
