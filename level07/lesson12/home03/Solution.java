package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum = Integer.MIN_VALUE;
        int  minimum = Integer.MAX_VALUE;

        //Напишите тут ваш код
        int maxInd = 20;
        int[] array = new int[maxInd];

        for (int i = 0; i < maxInd; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0;i<maxInd;i++){
            if (minimum>=array[i]) minimum = array[i];
            if (maximum<=array[i]) maximum = array[i];
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
