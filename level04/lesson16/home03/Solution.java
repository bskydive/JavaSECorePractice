package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String inputStr = "";
            int inputNum = 0;
            int outNum = 0;

        while (inputNum != -1) {

            inputStr = inputReader.readLine();
            inputNum = Integer.parseInt(inputStr);
            outNum += inputNum;

        }
            System.out.println(Integer.toString(outNum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
