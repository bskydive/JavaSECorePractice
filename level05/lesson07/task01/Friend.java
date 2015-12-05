package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код

    private int name, length, colour;

    public void  initialize(int name)
    {
        this.name = name;
    }

    public void  initialize(int name, int length)
    {
        this.name = name;
        this.length = length;
    }

    public void  initialize(int name, int length, int colour)
    {
        this.name = name;
        this.length = length;
        this.colour = colour;
    }


}
