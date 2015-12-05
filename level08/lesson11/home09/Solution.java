package com.javarush.test.level08.lesson11.home09;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date date2 = new Date(date);
        date2.setHours(0);
        date2.setMinutes(0);
        date2.setSeconds(0);

        Date date1 = new Date(date);
        date1.setYear(date1.getYear());
        date1.setDate(0);
        date1.setMonth(0);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);

        return (( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24))%2!=0 );
    }
}

