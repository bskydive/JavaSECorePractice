package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{

    public static void main(String[] args)
    {

        ArrayList<Object> arrHuman = new ArrayList<Object>();

        ArrayList<Human> arrChild1 = new ArrayList<Human>();

        arrChild1.add(new Human("Name1",new ArrayList<Human>(),true,10));
        arrChild1.add(new Human("Name2",new ArrayList<Human>(),false,10));
        arrChild1.add(new Human("Name3",new ArrayList<Human>(),true,10));

        arrHuman.addAll(arrChild1);

        ArrayList<Human> arrChild2 = new ArrayList<Human>();

        arrChild2.add(new Human("Name4",arrChild1,true,40));
        arrChild2.add(new Human("Name5",arrChild1,false,40));

        arrHuman.addAll(arrChild2);

        ArrayList<Human> arrChild3 = new ArrayList<Human>();

        arrChild3.add(new Human("Name6",arrChild2,true,90));
        arrChild3.add(new Human("Name7",arrChild2,false,90));

        arrHuman.addAll(arrChild3);

        arrHuman.add(new Human("Name8",arrChild2,true,90));
        arrHuman.add(new Human("Name9",arrChild3,false,90));

        for (int i=0;i<arrHuman.size();i++) System.out.println(arrHuman.get(i));

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();


        Human(String name, ArrayList<Human> child, boolean sex, int age)
        {
            this.name = name;
            this.children = child;
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

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }




}
