package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight (Cat anotherCat)
    {
        int fightIndex1 = (this.weight+this.strength)/this.age;
        int fightIndex2 = (anotherCat.weight+anotherCat.strength)/anotherCat.age;


        if (fightIndex1 > fightIndex2) {
            return true;
        } else {
            return false;
        }

    }
}
