package com.javarush.test.level18.lesson10.home09;

/* Файлы и исключения
Читайте с консоли имена файлов
Если файла не существует (передано неправильное имя файла), то
перехватить исключение, вывести в консоль переданное неправильное имя файла и завершить работу программы
Не забудьте закрыть все потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inStr="";
        try {
        FileInputStream f = null;

        while (!inStr.equals("exit")) {
            inStr=reader.readLine();
            try{

                f = new FileInputStream(inStr);

            } catch (FileNotFoundException e){

                System.out.println(inStr);
                reader.close();
                f.close();

            }
        }

        }catch (IOException e) {

        }


    }
}
