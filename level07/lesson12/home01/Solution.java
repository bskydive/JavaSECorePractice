package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maxInd = 10;
        int[] list = new int[maxInd];
        int[] array = new int[maxInd];

        for (int i = 0; i < maxInd; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0;i<maxInd;i++){
            list[maxInd-i-1]=array[i];
        }

        for (int i=0;i<maxInd;i++){
            array[i]=list[i];
        }

        for (int x : array)
        {
            System.out.println(x);
        }
    }

}
