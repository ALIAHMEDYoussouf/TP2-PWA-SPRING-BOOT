package com.tp2youssouf.demo;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {
    @Inject
    TemVegetabeRep leVeg;

    @GetMapping("/")
    @RequestMapping
    public String LaPageDaccueil(Model model) {
        ArrayList<Vegetal> lesVe;
        lesVe = leVeg.findAll();

        model.addAttribute("hi", "hellowwww");
        model.addAttribute("salut", "le monde");
        model.addAttribute("veges", lesVe);

        return "simple";
    }

}
