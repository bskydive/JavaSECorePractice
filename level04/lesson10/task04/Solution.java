package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int outPosX = 1;
        int outPosY = 1;
        final int maxPosXY = 10;
        final int minPosY = 1;

        while (outPosX<=maxPosXY){
            outPosY = minPosY;
            while (outPosY<=maxPosXY){
                System.out.print("S");
                outPosY++;
            }
            System.out.println();
            outPosX++;
        }


    }
}
