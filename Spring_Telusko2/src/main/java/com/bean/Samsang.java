package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsang {
    @Autowired
    @Qualifier("snapdragon")
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void confi(){
        System.out.println("Octa cor, 4GB RAM ,12MP camera ");
        cpu.process();
    }
}
