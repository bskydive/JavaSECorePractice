package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputStr = inputReader.readLine();
            int inputN = Integer.parseInt(inputReader.readLine());

            final int minM = 1;
            final int minN = 1;
            int n = minN;

                while ( n <= inputN) {
                    System.out.println(inputStr);
                    n++;
                }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
