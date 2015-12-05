package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputName = inputReader.readLine();
            String inputAge = inputReader.readLine();

            if ( Integer.parseInt(inputAge) < 18 ) {
                System.out.println("Подрасти еще");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
