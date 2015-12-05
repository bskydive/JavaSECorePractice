package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть поток ввода.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner inputFile = new Scanner(new File(reader.readLine()));

        String inStr="";
        int i=0;


        while (inputFile.hasNext()){

            inStr=inputFile.nextLine();

            inStr=inStr.replaceAll("\\p{P}","");
            String[] inStrArr = inStr.split(" ");



            for (int j=0;j<inStrArr.length;j++) {
                if (inStrArr[j].equals("world")) i++;
            }
        }

        System.out.println(i);
        reader.close();
        inputFile.close();
    }
}
