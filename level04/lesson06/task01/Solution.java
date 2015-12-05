package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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
                String inputNum1 = inputReader.readLine();
                String inputNum2 = inputReader.readLine();
                if ( Integer.parseInt(inputNum1) < Integer.parseInt(inputNum2) ) {
                    System.out.println(inputNum1);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}