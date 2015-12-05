package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {

        int minInd=0;
        String minimum;

        String[] arr1 = array.clone();

        for (int j = 0; j<array.length;j++){
            minimum = "";
            for (int i = 0; i<arr1.length;i++){
                if (!isGreaterThen(minimum,arr1[i])){
                    minimum = arr1[i];
                    minInd = i;
                }
            }

            array[array.length-j-1]=minimum;
            arr1[minInd]="";
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
