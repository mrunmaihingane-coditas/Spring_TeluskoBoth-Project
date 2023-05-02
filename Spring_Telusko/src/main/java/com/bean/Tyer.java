package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Tyer {
    private String Brand;

    public String getBrand() {
        return Brand;
    }

    public Tyer() {
    }

    public Tyer(String brand) {
        Brand = brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "tyre is working";
    }
}
