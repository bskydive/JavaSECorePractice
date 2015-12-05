package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String inputM = inputReader.readLine();

                System.out.println("Я буду зарабатывать $"+inputM+" в час");
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}