package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(System.in);

        String inStr="";

        while (!inStr.equals("exit")) {
            inStr=reader.nextLine();
            ReadThread r = new ReadThread(inStr);
            r.start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) throws IOException
        {
            this.fileName=fileName;

        }

        @Override
        public void run()
        {
            ArrayList<Byte> b = new ArrayList<>();

            try
            {
                FileInputStream inputFile = new FileInputStream(fileName);

                byte[] bytes = new byte[inputFile.available()];


                while (inputFile.available()>0) inputFile.read(bytes);

                inputFile.close();



            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


            Map<Byte,Integer> maxByte = new HashMap<>();

            for (int i=0;i<b.size();i++) {
                if (maxByte.containsKey(b.get(i))){
                    maxByte.put(b.get(i), maxByte.get(b.get(i))+1);
                } else {
                    maxByte.put(b.get(i),1);
                }
            }

            int maxValue = Integer.MIN_VALUE, maxKey=0;

            for (Map.Entry<Byte,Integer> e:maxByte.entrySet()){
                if (e.getValue()>=maxValue) {
                    maxValue = e.getValue();
                    maxKey = e.getKey();
                }
            }

            resultMap.put(fileName,maxKey);
        }


        }

}
