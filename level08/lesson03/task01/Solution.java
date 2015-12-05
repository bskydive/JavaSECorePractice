package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        Set<String> hSet = new HashSet<String>();

        hSet.add("арбуз");
        hSet.add("банан");
        hSet.add("вишня");
        hSet.add("груша");
        hSet.add("дыня");
        hSet.add("ежевика");
        hSet.add("жень-шень");
        hSet.add("земляника");
        hSet.add("ирис");
        hSet.add("картофель");

        Iterator<String> iterator = hSet.iterator();
        while (iterator.hasNext()) {
            String txt = iterator.next();
            System.out.println(txt);
        }

    }
}
