package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
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

