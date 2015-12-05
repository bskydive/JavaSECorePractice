package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double parseDoubleVar;

        String inStr = "", firstParam,secParam;

        try{
            inStr = reader.readLine();
        } catch (IOException e){
            reader.close();
        }

        Map<String, String> query_pairs = new LinkedHashMap<String, String>();
        String[] pairs = inStr.split("\\?")[1].split("&");

        for (String pair : pairs) {
            if (pair.equals("")) continue;
            int idx = pair.indexOf("=");
            if (idx > 0) {
                firstParam = pair.substring(0, idx);
                secParam = pair.substring(idx + 1);

                query_pairs.put(firstParam, secParam);

                System.out.print(firstParam+" ");

            } else{
                query_pairs.put(pair, "");
                System.out.print(pair +" ");
            }


        }

        System.out.println();

        for (Map.Entry<String,String> pair : query_pairs.entrySet()) {

            parseDoubleVar=Double.MAX_VALUE;
//            obj.javarush.ru/?op=obj&&obj=3&obj=.3&values=5&object=this&obj=&oobj=7.7

            if (pair.getKey().equals("obj") && !pair.getValue().equals(""))  {
                try {
                    parseDoubleVar=Double.parseDouble(pair.getValue());
                    alert((double) parseDoubleVar);

                } catch (NumberFormatException e) {

                }

                if (parseDoubleVar == Double.MAX_VALUE)  alert(pair.getValue());
            }

        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

}
