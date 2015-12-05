package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));



        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i<5;i++){
            arr.add(Integer.toString(i));
        }
        System.out.println(arr.size());

        for (int j = 0; j<5;j++){
            System.out.println(arr.get(j));

            }

    }
}
