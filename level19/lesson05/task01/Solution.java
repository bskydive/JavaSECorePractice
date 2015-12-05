package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream input1FileStream = new FileInputStream(reader.readLine());
        FileOutputStream outputFileStream = new FileOutputStream(reader.readLine());


//         outputFileStream.write(outStr.getBytes());

        reader.close();
        outputFileStream.close();
        input1FileStream.close();

    }
}
