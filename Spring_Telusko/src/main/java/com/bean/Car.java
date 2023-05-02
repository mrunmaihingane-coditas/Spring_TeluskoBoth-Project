package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical{
    @Autowired
    private Tyer tyre;

    public Tyer getTyre() {
        return tyre;
    }

    public void setTyre(Tyer tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        System.out.println(" Car..."+tyre);
    }
}
