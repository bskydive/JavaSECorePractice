package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{

    private String name = "";
    private int length = 0;
    private int colour = 0;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int length){
        this.name = name;
        this.length = length;
    }

    public void initialize(String name, int length, int colour){
        this.name = name;
        this.length = length;
        this.colour = colour;
    }

}
