package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static void print(int out){
        System.out.print(out);
    }

    public static void print(Integer out){
        System.out.print(out.intValue());
    }

    public static void print(String out){
        System.out.print(out);
    }

    public static void print(char out){
        System.out.print(out);
    }

    public static void print(double out){
        System.out.print(out);
    }
}
