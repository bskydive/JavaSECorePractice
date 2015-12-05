package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код

    private int name, length, colour;

    public Friend(int name)
    {
        this.name = name;
    }

    public Friend(int name, int length)
    {
        this.name = name;
        this.length = length;
    }

    public Friend(int name, int length, int colour)
    {
        this.name = name;
        this.length = length;
        this.colour = colour;
    }

}