package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strIn = reader.readLine();
        String strV ="";
        String strNV ="";
        char charIn;

        int l=strIn.length();

        for(int i=0; i<l-1; i++)
        {
            charIn = strIn.charAt(i);
            if (isVowel(charIn) )
                strV += charIn+" ";
            else if ( charIn != ' ' ) strNV += strIn.charAt(i)+" ";
        }

        charIn = strIn.charAt(l-1);
        if (isVowel(charIn) )
            strV += charIn;
        else if ( charIn != ' ' ) strNV += strIn.charAt(l-1);

        System.out.println(strV);
        System.out.println(strNV);

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
