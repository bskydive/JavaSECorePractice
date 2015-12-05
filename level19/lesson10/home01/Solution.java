package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException,NumberFormatException
    {

        Scanner inputFile = new Scanner(new File(args[0]));

        Map<String,Double> map = new TreeMap<>();

        String[] midStr;
        String outStr="";

        while (inputFile.hasNext()) {
            midStr = inputFile.nextLine().split(" ");
            if (map.get(midStr[0]) != null) {
                map.put(midStr[0],map.get(midStr[0])+Double.parseDouble(midStr[1]));
            } else {
            map.put(midStr[0],Double.parseDouble(midStr[1]));
            }
        }


        for (Map.Entry<String,Double> m: map.entrySet()) {
                System.out.println(m.getKey()+" "+m.getValue());
        }


        inputFile.close();

    }
}
