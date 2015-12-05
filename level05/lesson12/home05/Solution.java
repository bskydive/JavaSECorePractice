package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{



    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String str = "";

        try {
            boolean i = true;

            while (i) {
                str = reader.readLine();
                if (str.equals("сумма")) {
                    i = false;
                } else {
                    try {
                        sum += Integer.parseInt(str);
                    } catch (NumberFormatException e) {
                        System.out.println("xxx");
                    }
                }




            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sum);

    }

}
