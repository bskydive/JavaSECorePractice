package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int minimum,minInd=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i<5;i++){
            arr.add(Integer.parseInt(reader.readLine()));
        }

        for (int j = 0; j<5;j++){
            minimum = Integer.MAX_VALUE;
            for (int i = 0; i<arr.size();i++){
                if (minimum >= arr.get(i)){
                    minimum = arr.get(i);
                    minInd = i;
                }
            }
            arr.remove(minInd);
            System.out.println(minimum);
        }



    }

}
