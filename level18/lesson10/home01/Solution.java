package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        char inputChar;
        int englishCharCount = 0;

        FileReader inputFile = new FileReader(args[0]);

        while (inputFile.ready())
        {
            inputChar = (char) inputFile.read();
            if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) englishCharCount++;
        }

        System.out.println(englishCharCount);
        inputFile.close();
    }
}
