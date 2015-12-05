package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxInd = 3;

        int[] list = new int[maxInd];
        int[] listSorted = new int[maxInd];
        int maximum,remInd = 0;

        for (int i=0;i<maxInd;i++){
            try{
                list[i] = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("type number!");
            }
        }

//        int comp1 = compareInt(inputNum[0], inputNum[1]);
//        int comp2 = compareInt(inputNum[2], inputNum[3]);
//
//        System.out.print(compareInt(comp1,comp2));

        for (int j = 0; j<list.length;j++){

            maximum = Integer.MIN_VALUE;

            for (int i = 0; i<list.length;i++){
                if (maximum < list[i]){
                    maximum = list[i];
                    remInd = i;
                }
            }

            listSorted[j] = maximum;
            list[remInd] = Integer.MIN_VALUE;
        }

        for (int i=0;i<listSorted.length;i++){
            System.out.println(listSorted[i]);
        }

    }

    public static int compareInt(int inputNum1, int inputNum2){

        if ( inputNum1 > inputNum2 ) {
            return inputNum1;
        } else {
            return inputNum2;
        }
    }

}
