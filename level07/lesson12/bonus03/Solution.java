package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static int maxInd = 20;

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] arrIn = new int[maxInd];

        for (int i = 0; i < maxInd; i++)
        {
            arrIn[i] = Integer.parseInt(reader.readLine());
        }

        sort(arrIn);

        for (int i=0;i<maxInd;i++)
        {
            System.out.println(arrIn[i]);
        }
    }

    public static void sort(int[] array)
    {

        int minimum,minInd=0;

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        for (int j = 0; j<array.length;j++){
            arr1.add(array[j]);
        }

        for (int j = 0; j<array.length;j++){

            minimum = Integer.MAX_VALUE;

            for (int i = 0; i<arr1.size();i++){
                if (minimum >= arr1.get(i)){
                    minimum = arr1.get(i);
                    minInd = i;
                }
            }

            arr2.add(0,minimum);
            arr1.remove(minInd);
        }

        for (int j = 0; j<arr2.size();j++){
            array[j] = arr2.get(j);
        }


    }
}
