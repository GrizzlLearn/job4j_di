package ru.job4j.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dl
 * @date 03.07.2024 23:37
 */
public class MainXmlApp {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("classpath:app-context-xml.xml");
        Man man = ct.getBean(Man.class);
        man.print();
    }
}
