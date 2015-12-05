package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputName1 = inputReader.readLine();
            String inputName2 = inputReader.readLine();

            if ( inputName1.equals(inputName2) ) {
                System.out.println("Имена идентичны");
            } else {
                if ( inputName1.length() == inputName2.length() ) {
                    System.out.println("Длины имен равны");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
