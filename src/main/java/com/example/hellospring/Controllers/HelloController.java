package com.example.hellospring.Controllers;

import com.example.hellospring.Services.Serves;
import com.example.hellospring.Zellers.ZellersCongruence;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class HelloController {
    //1.1 - Exercise: Hello Spring
    @GetMapping("/first-mapping/")
    public String FirstMapping(){
        return "Hello user - how are you doing this fine day?";
    }

    //1.2 - Exercise: Echo
    @GetMapping("/echo")
    public String parameter(@RequestParam String input){
        return input;
    }

    //1.3 - Exercise: ErDetFredag?
    @GetMapping("/erdetfredag")
    public String ErDetFredag(){
        ZellersCongruence zellersCongruence = new ZellersCongruence();
        int day = zellersCongruence.IsItFriday();
        String currentDay;
        if(day == 6){
            currentDay = "Det er det nemlig!";
        } else {
            currentDay = "Desværre ikke, du må vente lidt";
        }
        return "Er det fredag?\n" + currentDay;
    }

    //1.4 - Hint: Steps
    @GetMapping("/todaysdate")
    public String todaysdate(){
        Serves serves = new Serves();
        return serves.DayofTheWeek();
    }

}
