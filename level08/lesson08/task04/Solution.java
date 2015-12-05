package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args){
        Date dt = new Date("JAN 1 1995");
        System.out.println(dt.getMonth());
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        Date dt = new Date();

        for (int i=0;i<10;i++) {
            dt.setYear(1980+i);
            dt.setMonth(1+i);
            dt.setDate(1+i);
            map.put("Иванов"+i, dt);

        }

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> it = map.entrySet().iterator();
        int m;
        while (it.hasNext()){
            m = it.next().getValue().getMonth();
            if ( m>4 & m<8) {
                it.remove();
            }
        }

    }
}
