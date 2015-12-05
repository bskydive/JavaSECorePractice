package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        Map<String,String> hm = new HashMap<String, String>();

        for (int i=0;i<10;i++){
            hm.put("вася" + Integer.toString(i),"обломов"+Integer.toString(i));
        }

        return (HashMap<String,String>) hm;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int cnt=0;
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<String,String> p = it.next();
            if (p.getValue()==name) cnt++;
        }

        return cnt;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int cnt=0;

        for (Map.Entry<String,String> me:map.entrySet()){
            if (me.getKey()==familiya) cnt++;
        }

        return cnt;
    }
}
