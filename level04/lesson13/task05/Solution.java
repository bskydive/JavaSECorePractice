package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String inputM = inputReader.readLine();

                for (int i = 1; i<=10;i++) {
                    System.out.println(inputM+" любит меня.");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
