package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String destinationFileName = reader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        String data1,data="";
        while (! data.equals("exit"))
        {
             data = reader.readLine();

            data1 = data+  "\r\n";
            fileOutputStream.write(data1.getBytes());
        }

        fileOutputStream.close();
        reader.close();


    }
}
