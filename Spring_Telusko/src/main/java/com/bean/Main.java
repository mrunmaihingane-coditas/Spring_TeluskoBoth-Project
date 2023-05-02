package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBean.xml");

//        Vehical obj = (Vehical) context.getBean("bike");
//        obj.drive();
//
        Car obj = (Car) context.getBean("car");
        obj.drive();
//
//        Tyer t = (Tyer) context.getBean("tyre");
//        System.out.println(t);

    }
}
