package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream input1FileStream = new FileInputStream(reader.readLine());
        FileOutputStream outputFileStream = new FileOutputStream(reader.readLine());


        byte[] inBytes = new byte[input1FileStream.available()];


        if (input1FileStream.available()>0) input1FileStream.read(inBytes);

        String inStr=new String(inBytes);

        String[] midStr = inStr.split(" ");
        String outStr="";

        for (int i=0;i<midStr.length;i++) {
            try{
                outStr += Integer.parseInt(midStr[i])+" ";
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }

        outputFileStream.write(outStr.getBytes());

        reader.close();
        outputFileStream.close();
        input1FileStream.close();
    }
}
