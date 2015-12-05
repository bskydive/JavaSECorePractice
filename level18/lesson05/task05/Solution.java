package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть все потоки ввода-вывода
2.2 выбросить исключение DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputFileName, outputFileName1;
        int outputFile1BytesCount;

        inputFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(inputFileName);

        outputFile1BytesCount = fileInputStream.available();

        if (outputFile1BytesCount>1000) throw new DownloadException();

        fileInputStream.close();
        reader.close();
    }

    public static class DownloadException extends Exception{

    }
}
