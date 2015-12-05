package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        Integer byteFromFile,maxByteFromFile,maxFreqByteFromFile=0,freqByteFromFile;

        Map<Integer,Integer> fileBytesFreq  = new HashMap<Integer,Integer>();

        byteFromFile = inputStream1.read();

        if (inputStream1.available()>0) {
            fileBytesFreq.put(byteFromFile,1);
            maxFreqByteFromFile=1;
        }

        while (inputStream1.available()>0){

            byteFromFile = inputStream1.read();

            if(fileBytesFreq.containsKey(byteFromFile)){
                freqByteFromFile=fileBytesFreq.get(byteFromFile);
                fileBytesFreq.remove(byteFromFile);
                fileBytesFreq.put(byteFromFile,freqByteFromFile+1);

                if (freqByteFromFile>maxFreqByteFromFile) maxFreqByteFromFile=freqByteFromFile;
            } else {
                fileBytesFreq.put(byteFromFile,1);
                maxFreqByteFromFile=1;
            }
        }

        for (Integer byteKey:fileBytesFreq.keySet()){
            if (fileBytesFreq.get(byteKey)>=maxFreqByteFromFile) System.out.print(byteKey+" ");

        }

        reader.close();
        inputStream1.close();

    }
}
