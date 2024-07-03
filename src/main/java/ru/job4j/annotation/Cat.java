package ru.job4j.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dl
 * @date 03.07.2024 21:13
 */
@Component
public class Cat implements Pet<Cat> {
    @Value("${cat.name}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "Cat name = %s".formatted(name);
    }
}
