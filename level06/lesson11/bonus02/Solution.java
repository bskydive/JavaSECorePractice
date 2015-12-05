package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Name1 = reader.readLine();
        Cat cat1 = new Cat(Name1);
        String Name2 = reader.readLine();
        Cat cat2 = new Cat(Name2);

        String Name3 = reader.readLine();
        Cat cat3 = new Cat(Name3,cat1,null);
        String Name4 = reader.readLine();
        Cat cat4 = new Cat(Name4,null,cat2);

        String Name5 = reader.readLine();
        Cat cat5 = new Cat(Name5,cat3,cat4);
        String Name6 = reader.readLine();
        Cat cat6 = new Cat(Name6,cat3,cat4);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println(cat6);

    }

    public static class Cat
    {
        private String name;
        private Cat mom, dad;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat dad, Cat mom)
        {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }

        @Override
        public String toString()
        {
            String out = "Cat name is " + name;

            if (mom == null) out += ", no mother";
            else out += ", mother is " + mom.name;

            if (dad == null) out += ", no father";
            else out += ", father is " + dad.name;

            return out;
        }
    }

}
