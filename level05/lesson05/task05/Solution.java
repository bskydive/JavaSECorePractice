package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here

        Cat[] catMass = new Cat[3];


        for (int i = 0; i <= 2; i++){
            catMass[i] = new Cat(Integer.toString(i),i,i,i);
        }

            if ( catMass[0].fight(catMass[1])) {
                System.out.println(catMass[0].name+" win");
            } else System.out.println(catMass[1].name+" win");

            if (catMass[0].fight(catMass[2])){
                System.out.println(catMass[0].name+" win");
            } else System.out.println(catMass[2].name+" win");

            if (catMass[1].fight(catMass[2])){
                System.out.println(catMass[1].name+" win");
            } else System.out.println(catMass[2].name+" win");




    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }
    }
}
