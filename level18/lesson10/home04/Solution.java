package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1,fileName2;
        fileName1 = reader.readLine();
        fileName2 = reader.readLine();

        FileInputStream inputFileStream = new FileInputStream(fileName1);

        byte[] inputFileBytes = new byte[inputFileStream.available()];
        if (inputFileStream.available()>0) inputFileStream.read(inputFileBytes);

        inputFileStream.close();


        FileOutputStream outputFileStream = new FileOutputStream(fileName1);
        inputFileStream = new FileInputStream(fileName2);

        while (inputFileStream.available()>0) outputFileStream.write(inputFileStream.read());

        for (int i=0;i<inputFileBytes.length;i++) outputFileStream.write(inputFileBytes[i]);




        reader.close();
        outputFileStream.close();
        inputFileStream.close();
    }
}
