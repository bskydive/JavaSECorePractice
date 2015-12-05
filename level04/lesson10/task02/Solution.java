package com.javarush.test.level04.lesson10.task02;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код


        final int maxNumX = 10;
        final int minNumX = 1;
        int outNumX = maxNumX;

        while (outNumX>=minNumX){
            System.out.print(Integer.toString(outNumX)+" ");
            outNumX--;
        }

    }
}
