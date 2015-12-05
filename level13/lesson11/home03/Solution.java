package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = "";

            sourceFileName = reader.readLine();



        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        while (fileInputStream.available() > 0)
        {
            System.out.print((char)fileInputStream.read());
        }

        fileInputStream.close();
        reader.close();
    }
}
