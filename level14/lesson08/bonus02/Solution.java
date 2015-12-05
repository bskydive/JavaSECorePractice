package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a=1,b=1;

        try{
            a=Integer.parseInt(reader.readLine());
            b=Integer.parseInt(reader.readLine());

            System.out.println(nod(a,b));

        } catch (IOException | NumberFormatException e){
            e.printStackTrace();
        }


    }

    public static int nod(int a, int b) {

        if (b == 0) return Math.abs(a);

        return nod(b, a % b);

    }
}
