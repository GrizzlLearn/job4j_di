package ru.job4j.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dl
 * @date 03.07.2024 21:15
 */
@Component
public class Bird implements Pet<Bird> {
    @Value("${bird.name:simpleBird}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "Bird name = %s".formatted(name);
    }
}
