package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<Human> arrHuman = new ArrayList<Human>();

        arrHuman.add(new Human("Name1",null,null,true,90));
        arrHuman.add(new Human("Name2",null,null,false,90));

        arrHuman.add(new Human("Name3",null,null,true,90));
        arrHuman.add(new Human("Name4",null,null,false,90));

        arrHuman.add(new Human("Name5",arrHuman.get(0),arrHuman.get(1),true,50));
        arrHuman.add(new Human("Name6",arrHuman.get(2),arrHuman.get(3),false,50));

        arrHuman.add(new Human("Name7",arrHuman.get(4),arrHuman.get(5),true,10));
        arrHuman.add(new Human("Name8",arrHuman.get(4),arrHuman.get(5),true,20));
        arrHuman.add(new Human("Name9",arrHuman.get(4),arrHuman.get(5),true,30));

        for (int i=0;i<arrHuman.size();i++) System.out.println(arrHuman.get(i));
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father, mother;


        Human(String name, Human father, Human mother, boolean sex, int age)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
