package com.javarush.test.level06.lesson05.task02;

/* Классы Cat и Dog и метод finalize для каждого
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat
{
    //Напишите тут ваш код


    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("cat dead");
        super.finalize();    //To change body of overridden methods use File | Settings | File Templates.

    }
}

class Dog
{
    //Напишите тут ваш код

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("dog dead");
        super.finalize();    //To change body of overridden methods use File | Settings | File Templates.

    }

}