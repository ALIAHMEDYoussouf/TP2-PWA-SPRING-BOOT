package com.tp2youssouf.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TemVegetabeRep implements VegetableRep {

    ArrayList<Vegetal> lesVegetal = new ArrayList<>();

    public TemVegetabeRep(ArrayList<Vegetal> lesVegetal) {
        this.lesVegetal = lesVegetal;
    }

    @Override
    public ArrayList<Vegetal> findAll() {
        lesVegetal.add(new Vegetal("Toto", "rouge", 50));
        lesVegetal.add(new Vegetal("Arbre", "blanc", 100));
        lesVegetal.add(new Vegetal("Harico", "Vert", 800));

        return lesVegetal;
    }

}
