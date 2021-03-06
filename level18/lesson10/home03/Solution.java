package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream outputFileStream = new FileOutputStream(reader.readLine());
        FileInputStream input1FileStream = new FileInputStream(reader.readLine());
        FileInputStream input2FileStream = new FileInputStream(reader.readLine());


        while (input1FileStream.available()>0) {
            outputFileStream.write(input1FileStream.read());
        }
        while (input2FileStream.available()>0) {
            outputFileStream.write(input2FileStream.read());
        }

        reader.close();
        outputFileStream.close();
        input1FileStream.close();
        input2FileStream.close();

    }
}
