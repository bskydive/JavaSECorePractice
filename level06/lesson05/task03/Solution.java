package com.javarush.test.level06.lesson05.task03;

/* 10 000 объектов Cat и Dog
Создать в цикле 10 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/



public class Solution
{

    public static void main(String[] args)
    {
        int maxI = 100000;
        Cat[] catMas = new Cat[maxI];
        Dog[] dogMas = new Dog[maxI];

        for (int i=0;i<maxI;i++){
            catMas[i] = new Cat();
            dogMas[i] = new Dog();
        }
    }
}

class Cat
{


    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{



    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}