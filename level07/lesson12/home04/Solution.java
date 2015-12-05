package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        String str;

        try {
            boolean i = true;

            while (i) {
                str = reader.readLine();
                if (str.equals("end")) i = false;
                else list.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

for (int i=0;i<list.size();i++) System.out.println(list.get(i));


    }
}
