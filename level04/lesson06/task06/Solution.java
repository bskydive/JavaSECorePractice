package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputName = inputReader.readLine();
            String inputAge = inputReader.readLine();

            if ( Integer.parseInt(inputAge) > 20 ) {
                System.out.println("И 18-ти достаточно");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
