package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(1);
        print(Integer.valueOf(1));
    }

    public static void print(int out){
        System.out.print(out);
    }

    public static void print(Integer out){
        System.out.print(out.intValue());
    }
}
