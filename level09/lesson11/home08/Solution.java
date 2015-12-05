package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов д
линой 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> arrOut = new ArrayList<int[]>();

        int[] maxInd = {5, 2, 4, 7, 0};

        for (int i=0;i<5;i++ ) {
            int[] arr = new int[maxInd[i]];
            System.out.println(i);
            for (int j=0;j<arr.length;j++){
                arr[j] = j+i;
            }

            arrOut.add(arr.clone());
        }

        return arrOut;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
