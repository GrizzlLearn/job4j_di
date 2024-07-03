package ru.job4j.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dl
 * @date 02.07.2024 20:16
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.job4j.lifecycle");
        context.close();
    }
}
