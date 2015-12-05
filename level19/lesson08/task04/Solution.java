package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException,NumberFormatException
    {

        PrintStream ps = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(ps);

        String result="",inStr = output.toString();
        Integer a,b;

        if (inStr.indexOf("+")>0) {
            String[] strings = inStr.split("\\+");
            a = Integer.parseInt(strings[0].replaceAll("\\D",""));
            b = Integer.parseInt(strings[1].replaceAll("\\D",""));
            result = Integer.toString(a+b);
        }

        if (inStr.indexOf("-")>0) {
            String[] strings = inStr.split("\\-");
            a = Integer.parseInt(strings[0].replaceAll("\\D",""));
            b = Integer.parseInt(strings[1].replaceAll("\\D",""));
            result = Integer.toString(a-b);
        }

        if (inStr.indexOf("*")>0) {
            String[] strings = inStr.split("\\*");
            a = Integer.parseInt(strings[0].replaceAll("\\D",""));
            b = Integer.parseInt(strings[1].replaceAll("\\D",""));
            result = Integer.toString(a*b);
        }



        System.out.println(inStr+result);

        output.close();
        stream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

