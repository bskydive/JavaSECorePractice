package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        final int divRes = 0;
        final int divNum = 2;
        final int minX = 1;
        final int maxX = 100;

        for (int x = minX; x <= maxX; x++){
                if ((x%divNum) == divRes) System.out.print(x+" ");

        }



    }
}
