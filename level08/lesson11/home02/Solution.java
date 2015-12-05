package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {

        Set<Cat> catSet = new HashSet<Cat>();
        catSet.add(new Cat("name1"));
        catSet.add(new Cat("name2"));
        catSet.add(new Cat("name3"));
        catSet.add(new Cat("name4"));

        return catSet;

    }

    public static Set<Dog> createDogs()
    {
        Set<Dog> dogSet= new HashSet<Dog>();
        dogSet.add(new Dog("name1"));
        dogSet.add(new Dog("name2"));
        dogSet.add(new Dog("name3"));


        return dogSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> petSet= new HashSet<Object>();
        petSet.addAll(cats);
        petSet.addAll(dogs);
        return petSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object text: pets)
        {
            System.out.println(text);
        }
    }

    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }
    }

    public static class Dog
    {
        String name;

        public Dog(String name)
        {
            this.name = name;
        }
    }


}
