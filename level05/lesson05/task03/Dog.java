package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {

    String name;
    int age;

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getAge(){
        return this.age;
    }

    void setAge(int age){
        this.age = age;
    }



}