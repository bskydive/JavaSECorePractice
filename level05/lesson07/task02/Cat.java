package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    //Напишите тут ваш код

    private int weight, age, colour;
    private String name, adress;
    private static final int DEF_INT = 10;
    private static final String DEF_STR = "10";

    public void  initialize(String name)
    {
        //1Имя
        this.name = name;
        this.colour = DEF_INT;
        this.weight = DEF_INT;
        this.age = DEF_INT;
    }

    public void  initialize(String name, int weight, int age)
    {
        //Имя, вес, возраст
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.colour = DEF_INT;
    }

    public void  initialize(String name, int age)
    {
        //3Имя, возраст (вес стандартный)
        this.name = name;
        this.weight = DEF_INT;
        this.age = age;
        this.colour = DEF_INT;
    }
    public void  initialize(int weight, int colour)
    {
//5вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
        this.weight = weight;
        this.colour = colour;
    }

    public void  initialize(int weight, int colour, String adress)
    {
        //вес, цвет, адрес ( чужой домашний кот)
        this.weight = weight;
        this.age = DEF_INT;
        this.adress = adress;
        this.colour = colour;
    }
}
