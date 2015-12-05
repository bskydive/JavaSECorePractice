package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inputFile = new Scanner(new File(args[0]));

        Map<String,Double> map = new TreeMap<>();

        String[] midStr;

        while (inputFile.hasNext()) {
            midStr = inputFile.nextLine().split(" ");
            if (map.get(midStr[0]) != null) {
                map.put(midStr[0],map.get(midStr[0])+Double.parseDouble(midStr[1]));
            } else {
                map.put(midStr[0],Double.parseDouble(midStr[1]));
            }
        }

        Double maxDbl=Double.MIN_VALUE;

        for (Map.Entry<String,Double> m: map.entrySet()) {
            if (m.getValue()> maxDbl) maxDbl=m.getValue();
        }

        for (Map.Entry<String,Double> m: map.entrySet()) {
            if (m.getValue()== maxDbl) System.out.print(m.getKey()+" ");;
        }



        inputFile.close();

    }
}
