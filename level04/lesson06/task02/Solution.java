package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{

    static int[] inputNum = {0,0,0,0};

    public static int compareInt(int inputNum1, int inputNum2){

        if ( inputNum1 > inputNum2 ) {
            return inputNum1;
        } else {
            return inputNum2;
        }
    }

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
                BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));


        try {

            for (int i = 0; i <= 3; i++) {
                inputNum[i] = Integer.parseInt(inputReader.readLine());
            }

            int comp1 = compareInt(inputNum[0], inputNum[1]);
            int comp2 = compareInt(inputNum[2], inputNum[3]);

            System.out.print(compareInt(comp1,comp2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
