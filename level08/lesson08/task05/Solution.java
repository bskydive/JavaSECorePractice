package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args){

        HashMap<String,String> newMap = createMap();
        printMap(newMap);
        removeTheFirstNameDuplicates(newMap);
        System.out.println();
        printMap(newMap);
    }

    public static void printMap(HashMap<String, String> map){

        for (Map.Entry<String,String> pair: map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
//
    public static HashMap<String, String> createMap()
    {
            HashMap<String,String> createdMap = new HashMap<String, String>();

            for (int i=0;i<5;i++) {
                createdMap.put("Ivanov" + i, "Ivan" + i);
                createdMap.put("Petrov" + i, "Ivan" + i);
            }

            return createdMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
            HashMap<String,String> copiedMap = new HashMap<String, String>(map);

            for (Map.Entry<String,String> pair: copiedMap.entrySet()){
                String copiedMapValue = pair.getValue();
                removeItemFromMapByValue(map,copiedMapValue);
            }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
//        HashMap<String, String> copy = new HashMap<String, String>(map);
//        for (Map.Entry<String, String> pair: copy.entrySet())
//        {
//            if (pair.getValue().equals(value))
//                map.remove(pair.getKey());
//        }

            Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();

            int repeatCount=0;

            while (it.hasNext()) {
                String mapValue = it.next().getValue();

                if (mapValue.equals(value)) {
                    if (repeatCount>0 ){
                        it.remove();
                        System.out.println("remove:" + mapValue);
                    } else repeatCount++;
                }
            }
    }
}
