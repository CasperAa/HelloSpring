package com.example.hellospring.Services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Serves {
    public String DayofTheWeek (){
        // Calculate date
        LocalDate localDate = LocalDate.now();

        //Returning an int between 0-6 representing the current weekday
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

        return "Today is " + dayOfWeek.name().substring(0,1).toUpperCase(Locale.ROOT)+dayOfWeek.name().substring(1).toLowerCase(Locale.ROOT);
    }

}
