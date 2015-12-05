package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int l=s.length();
        char c=Character.toUpperCase(s.charAt(0));
        s=c+s.substring(1);
        for(int i=1; i<l; i++)
        {
            if(s.charAt(i-1)==' ' & s.charAt(i)!=' ')
            {
                c=Character.toUpperCase(s.charAt(i));
                s=s.substring(0, i) + c + s.substring(i+1);
            }
        }

        System.out.println(s);
    }


}
