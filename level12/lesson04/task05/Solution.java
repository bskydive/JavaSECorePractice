package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int max(int in1, int in2){
        if (in1 > in2) return in1; else return in2;
    }
    public static long max(long in1, long in2){
        if (in1 > in2) return in1; else return in2;
    }
    public static double max(double in1, double in2){
        if (in1 > in2) return in1; else return in2;
    }
}
