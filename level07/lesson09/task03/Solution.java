package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxInd = 3;

        ArrayList<String> list = new ArrayList<String>();

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i=1;i<maxInd*2;i=i+2){
                list.add(i,"именно");
        }

        for (int i=0;i<maxInd*2;i++){
            System.out.println(list.get(i));
        }

    }
}
