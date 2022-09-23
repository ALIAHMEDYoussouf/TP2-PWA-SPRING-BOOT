package com.tp2youssouf.demo;

import lombok.Data;

@Data
public class Vegetal {
    String name;
    String colors;
    int price;

    public Vegetal() {

    }

    public Vegetal(String name, String colors, int price) {
        this.name = name;
        this.colors = colors;
        this.price = price;

    }

}
