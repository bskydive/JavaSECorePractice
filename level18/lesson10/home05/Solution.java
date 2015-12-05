package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
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
            outStr += Math.round(Double.parseDouble(midStr[i]))+" ";
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
