package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        char inputChar;
        int spaceCharCount = 0, inputCharCount = 0;

        FileReader inputFile = new FileReader(args[0]);

        while (inputFile.ready())
        {
            inputChar = (char) inputFile.read();
            inputCharCount++;
            if ((inputChar == ' ')) spaceCharCount++;
        }

        System.out.println(String.format("%.2f", (double)spaceCharCount/inputCharCount*100));
        inputFile.close();

    }
}
