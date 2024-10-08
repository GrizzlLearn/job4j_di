package ru.job4j.di.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dl
 * @date 02.07.2024 20:39
 */

@Component
public class Store {
    private List<String> data = new ArrayList<>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}
