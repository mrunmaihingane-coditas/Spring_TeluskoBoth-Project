package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

//        Samsang s7 = new Samsang();
//        s7.confi();
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsang s7 = factory.getBean(Samsang.class);
        s7.confi();

    }
}
