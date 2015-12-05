package com.javarush.test.level18.lesson03.task04;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        Integer byteFromFile,minFreqByteFromFile=1,freqByteFromFile;

        Map<Integer,Integer> fileBytesFreq  = new HashMap<Integer,Integer>();

        byteFromFile = inputStream1.read();

        if (inputStream1.available()>0) {
            fileBytesFreq.put(byteFromFile,1);
            minFreqByteFromFile=1;
        }

        while (inputStream1.available()>0){

            byteFromFile = inputStream1.read();

            if(fileBytesFreq.containsKey(byteFromFile)){

                freqByteFromFile=fileBytesFreq.get(byteFromFile);
                fileBytesFreq.remove(byteFromFile);
                fileBytesFreq.put(byteFromFile,freqByteFromFile+1);

                if (freqByteFromFile<minFreqByteFromFile) minFreqByteFromFile=freqByteFromFile;
            } else {
                fileBytesFreq.put(byteFromFile,1);
                minFreqByteFromFile=1;
            }
        }

        for (Integer byteKey:fileBytesFreq.keySet()){
            if (fileBytesFreq.get(byteKey)<=minFreqByteFromFile) System.out.print(byteKey+" ");

        }

        reader.close();
        inputStream1.close();
    }
}
