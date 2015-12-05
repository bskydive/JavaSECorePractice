package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int in1, int in2){
        if (in1 < in2) return in1; else return in2;
    }
    public static long min(long in1, long in2){
        if (in1 < in2) return in1; else return in2;
    }
    public static double min(double in1, double in2){
        if (in1 < in2) return in1; else return in2;
    }
}
