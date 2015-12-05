package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Iterator<Cat> itCat = cats.iterator();

        while (itCat.hasNext()){
            if (itCat.next().name=="name1") itCat.remove();
        }


        printCats(cats);
    }

    public static Set<Cat> createCats()
    {

        Set<Cat> catSet = new HashSet<Cat>();
        catSet.add(new Cat("name1"));
        catSet.add(new Cat("name2"));
        catSet.add(new Cat("name3"));

        return catSet;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat text: cats)
        {
            System.out.println(text);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }
    }

}
