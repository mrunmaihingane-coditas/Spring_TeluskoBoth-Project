package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{


    @Override
    public void process() {

        System.out.println("World best CPU");

    }
}
