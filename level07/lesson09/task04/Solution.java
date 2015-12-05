package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<String> list = new ArrayList<String>();


        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("коза"); //2

        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String> list1 = new ArrayList<String>();
        boolean r,l;

        for (int i=0;i<list.size();i++) {
            l= list.get(i).contains("л");
            r= list.get(i).contains("р");

            if (r&l) {
                list1.add(list.get(i));
                continue;
            }
            if (l) {
                list1.add(list.get(i));
                list1.add(list.get(i));
                continue;
            }
if (r) continue;
                list1.add(list.get(i));

        }
        return list1;
    }
}