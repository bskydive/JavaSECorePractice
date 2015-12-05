package com.javarush.test.level18.lesson03.task01;

import java.io.*;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int inInt,maxInt = Integer.MIN_VALUE;

        try{

            while (inputStream.available()>0){
                inInt = inputStream.read();
                if(maxInt < inInt) maxInt = inInt;
            }
        } finally
        {
            reader.close();
            inputStream.close();
            System.out.println(maxInt);
        }
    }
}
