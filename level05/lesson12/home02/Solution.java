package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man[] manMass = new Man[2];
        Woman[] womanMass = new Woman[2];

        for (int i = 0; i<=1; i++){
            manMass[i] = new Man(10+i,"name"+i,"address");
            System.out.println(manMass[i].name + " " + Integer.toString(manMass[i].age) + " " + manMass[i].address);
        }

        for (int i = 0; i<=1; i++){
            womanMass[i] = new Woman(10+i,"name"+i,"address");
            System.out.println(womanMass[i].name + " " + Integer.toString(womanMass[i].age) + " " + womanMass[i].address);
        }




    }

    // Напиши тут свои классы

    public static class Man{
        private int age;
        private String name, address;

        public Man(int age)
        {
            this.age = age;
        }

        public Man(int age, String name)
        {
            this.age = age;
            this.name = name;
        }

        public Man(int age, String name, String address)
        {
            this.age = age;
            this.name = name;
            this.address = address;
        }
    }

    public static class Woman{
        private int age;
        private String name, address;

        public Woman(int age)
        {
            this.age = age;
        }

        public Woman(int age, String name)
        {
            this.age = age;
            this.name = name;
        }

        public Woman(int age, String name, String address)
        {
            this.age = age;
            this.name = name;
            this.address = address;
        }

    }


}
