package ru.job4j.lifecycle.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.job4j.lifecycle.model.Product;

/**
 * @author dl
 * @date 02.07.2024 22:10
 */
@Configuration
public class Config {

    @Bean(name = "myProduct",
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    public Product getProduct() {
        return new Product("Good Product", 2.5);
    }
}
