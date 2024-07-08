package ru.job4j.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dl
 * @date 08.07.2024 23:47
 */

@Configuration
@ComponentScan(basePackages = "ru.job4j.aop")
@EnableAspectJAutoProxy
public class Config {
}
