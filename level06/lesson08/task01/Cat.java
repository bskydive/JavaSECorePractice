package com.javarush.test.level06.lesson08.task01;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat
{
    //Напишите тут ваш код

    static int catCount = 0;

    public Cat()
    {
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("cat dead");
        super.finalize();    //To change body of overridden methods use File | Settings | File Templates.

    }

}
