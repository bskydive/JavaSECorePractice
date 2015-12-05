package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int maxInd=20;
        int maxInd2=10;
        int[] arrI = new int[maxInd];
        int[] arrI1 = new int[maxInd2];
        int[] arrI2 = new int[maxInd2];


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<maxInd;i++){
            try{

                arrI[i] = Integer.parseInt(reader.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<maxInd2;i++){
            arrI1[i] = arrI[i];
            arrI2[i] = arrI[i+maxInd2];
        }

        for (int i=0;i<maxInd2;i++){
            System.out.println(arrI2[i]);
        }

    }
}
