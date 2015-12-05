package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
-	горизонтальную линию из 10 восьмёрок
-	вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final String outChar = "8";
        final int minY = 1;
        final int minX = 1;
        final int maxY = 10;
        final int maxX = 10;

        for (int x = minX; x <= maxX; x++){
            System.out.print(outChar);
        }

System.out.println();
        System.out.println();

            for (int y = minY; y <= maxY; y++) {
                System.out.println(outChar);

        }

    }
}
