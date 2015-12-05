package com.javarush.test.level04.lesson13.task02;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
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
            int inputM = Integer.parseInt(inputReader.readLine());
            int inputN = Integer.parseInt(inputReader.readLine());

            final String outChar = "8";

            final int minM = 1;

            final int minN = 1;



            for (int m = minM; m <= inputM; m++){
                for (int n = minN; n <= inputN; n++) {
                    System.out.print(outChar);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
