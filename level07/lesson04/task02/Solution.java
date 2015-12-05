package com.javarush.test.level07.lesson04.task02;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static int maxInd = 10;

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] arrIn = new String[maxInd];

        for (int i = 0; i < maxInd-2; i++)
        {
            arrIn[i] = reader.readLine();
        }

        for (int i=maxInd-1;i>=0;i--)
        {
            System.out.println(arrIn[i]);
        }
    }


}