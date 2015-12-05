package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    public String name;
    int age;
    int weight;
    int strength;

    public static void main(String[] args){
        Cat catOne = new Cat();
        catOne.name = "";
        catOne.age = 1;
        catOne.weight = 3;
        catOne.strength = 4;

//        System.out.print("1");
    }

}
