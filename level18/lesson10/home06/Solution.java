package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки

Пример вывода:
, 19
- 7
f 361
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Character inputChar;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
        List<String> outList = new ArrayList<String>();

        FileReader inputFile = new FileReader(reader.readLine());

        while (inputFile.ready())
        {
            inputChar = (char) inputFile.read();
            if (charFreq.containsKey(inputChar)) {
                charFreq.put(inputChar,charFreq.get(inputChar)+1);
            } else
            {
                charFreq.put(inputChar,0);
            }
        }


        for (int i=0;i<charFreq.size();i++){
            Integer minValue=Integer.MAX_VALUE,ii=0;
            Character minKey=(char)Byte.MAX_VALUE;

            for (Map.Entry<Character, Integer> charFreqValue : charFreq.entrySet()){

                if (((int)charFreqValue.getKey().charValue() <= minValue) && (charFreqValue.getValue() > 0)) {
                    minValue = charFreqValue.getValue();
                    minKey = charFreqValue.getKey();
                    charFreqValue.setValue(0);
                }

            }
            outList.add((byte)minKey.charValue() + " " + minKey+" "+minValue);
        }

        for (int i=0;i<outList.size();i++){
            System.out.println(outList.get(i));
        }


        inputFile.close();
    }
}
