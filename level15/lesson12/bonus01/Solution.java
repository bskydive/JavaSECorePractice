package com.javarush.test.level15.lesson12.bonus01;

/* Осваивание статического блока
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь 1 конструктор с параметром int - количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String. Параметр может быть "plane" или "helicopter".
3.2. Закрыть поток ввода методом close().
3.3. Если параметр равен "helicopter", то статическому объекту Flyable result присвоить
объект класса Helicopter.
3.4. Если параметр равен "plane", то считать второй параметр типа int,
статическому объекту Flyable result присвоить объект класса Plane.
4. В статическом блоке инициализировать Flyable result вызвав метод reset.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static {
        reset();
    }

    public static void main(String[] args){

    }

    public static Flyable result;

    public static void reset()
    {
        try{
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            String inStr=reader.readLine();

            if (inStr.equals("helicopter")) result=new Helicopter();

            if (inStr.equals("plane")) {

                inStr=reader.readLine();

                try {
                    result=new Plane(Integer.parseInt(inStr));
                } catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
