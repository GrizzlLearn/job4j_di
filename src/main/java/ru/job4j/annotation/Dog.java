package ru.job4j.annotation;

import org.springframework.stereotype.Component;

/**
 * @author dl
 * @date 03.07.2024 21:11
 */

public class Dog implements Pet<Dog> {
    private String name = "Dog";

    public void setName(String name) {
        this.name = name;
    }

    public Dog() { }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "Dog name = %s".formatted(name);
    }
}
