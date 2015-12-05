package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        DateFormat dtFmtIn= new SimpleDateFormat("M/d/yyyy");
        DateFormat dtFmtOut= new SimpleDateFormat("MMM dd, yyyy");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date dt = dtFmtIn.parse(reader.readLine());

        System.out.println(dtFmtOut.format(dt).toUpperCase(Locale.ENGLISH));
    }
}
