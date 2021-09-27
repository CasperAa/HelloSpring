package com.example.hellospring.Zellers;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ZellersCongruence {
    public int IsItFriday() {

        //Current Day
        LocalDate currentdate = LocalDate.now();
        int day = currentdate.getDayOfMonth();

        //Current Month
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH)+1;

        //Current year
        int year = currentdate.getYear();

        //January and February are counted as months 13 and 14  of  the  previous  year
        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        /*
        h is a temporary variable
        q is the day of the month (1-31)
        m is the month (1-12)
        j is the century:  year/100
        k is the year of the century:  year%100
         */

        int k = year % 100;
        int j = year / 100;

        //Formel
        int h = day + 13*(month + 1) / 5 + k + k / 4 + j / 4 + 5 * j;

        //d is the day of the week
        int d = h % 7;

        /*
        0 = Lørdag
        1 = Søndag
        2 = Mandag
        3 = Tirsdag
        4 = Onsdag
        5 = Torsdag
        6 = Fredag
        */

        return d;
    }
}
