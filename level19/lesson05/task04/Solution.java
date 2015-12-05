package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream input1FileStream = new FileInputStream(reader.readLine());
        FileOutputStream outputFileStream = new FileOutputStream(reader.readLine());


        byte[] inBytes = new byte[input1FileStream.available()];


        if (input1FileStream.available()>0) input1FileStream.read(inBytes);
        String inStr = new String(inBytes).replaceAll("\\.","!");

        outputFileStream.write(inStr.getBytes());



        reader.close();
        outputFileStream.close();
        input1FileStream.close();
    }
}
