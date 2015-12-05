package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код

         BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            int[] inputNum = new int[3];

            for (int i = 0; i<=2;i++){
                inputNum[i] = Integer.parseInt(inputReader.readLine());
            }

            int maxInd = 0;
            for (int i = 0; i<=2;i++){
                if ( inputNum[maxInd] >= inputNum[i] ) maxInd = i;
            }

            int minInd = 0;
            for (int i=0;i<=2;i++){
                if (maxInd == i) continue;
                if ( inputNum[minInd] <= inputNum[i] ) minInd = i;
            }

            for (int i=0;i<=2;i++){
                if (maxInd == i || i == minInd) continue;
                System.out.print(Integer.toString(inputNum[i]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
