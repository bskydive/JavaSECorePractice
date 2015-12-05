package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код

    private int name, length, colour;

    public Dog(int name)
    {
        this.name = name;
    }

    public Dog(int name, int length)
    {
        this.name = name;
        this.length = length;
    }

    public Dog(int name, int length, int colour)
    {
        this.name = name;
        this.length = length;
        this.colour = colour;
    }
}
