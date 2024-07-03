package ru.job4j.annotation;

import org.springframework.context.annotation.*;

/**
 * @author dl
 * @date 03.07.2024 21:22
 */

@Configuration
@ComponentScan(basePackages = "ru.job4j.annotation")
@PropertySource("classpath:application.properties")
public class Config {
    @Bean
    @Primary
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    public Dog someDog() {
        return new Dog("Dog123");
    }
}
