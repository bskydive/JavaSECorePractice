package com.javarush.test.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        final String outChar = "8";
        final int minY = 1;
        final int minX = 1;
//        final int maxY = 10;
        final int maxX = 10;



        for (int x = minX; x <= maxX; x++){


            for (int y = minY; y <= x; y++) {
                System.out.print(outChar);

            }
            System.out.println();
        }

    }
}
