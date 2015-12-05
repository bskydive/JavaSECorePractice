package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N=0;
        int M=0;
        ArrayList<String> listS = new ArrayList <String>();

        try {
            N = Integer.parseInt(reader.readLine());
            M = Integer.parseInt(reader.readLine());


            for (int i=0;i < N;i++){
                listS.add(reader.readLine());
            }

        } catch (NumberFormatException e) {
            System.out.println("xxx");
        }

        for (int i=0;i < M;i++){
            listS.add(listS.get(0));
            listS.remove(0);
        }

        for (int i=0;i<listS.size();i++) System.out.println(listS.get(i));
    }
}
