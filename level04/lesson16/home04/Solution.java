package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
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

                String inputName = inputReader.readLine();
                String inputY = inputReader.readLine();
                String inputM = inputReader.readLine();
                String inputD = inputReader.readLine();

                System.out.println("Меня зовут "+inputName);
                System.out.println("Я родился "+inputD+"."+inputM+"."+inputY);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
