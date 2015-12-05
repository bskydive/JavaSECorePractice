package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        Scanner fileReader= null;
        Integer inputNum=0;

        try{
            fileReader = new Scanner(new File(reader.readLine()));

            while (fileReader.hasNext()) {
                inputNum=0;
                try{
                    inputNum=Integer.parseInt(fileReader.nextLine());
                } catch (NumberFormatException e){
                    e.printStackTrace();
                }

                if (inputNum%2==0) arrayList.add(inputNum);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally
        {
            fileReader.close();
            reader.close();
        }


        int minInd=0;

        for (int i=0;i<arrayList.size();i++) {

            for (int j=0;j<arrayList.size();j++)
                if ((arrayList.get(j)!=Integer.MAX_VALUE) && (arrayList.get(j)<=arrayList.get(minInd))) minInd = j;

            arrayList1.add(arrayList.get(minInd));
            arrayList.set(minInd,Integer.MAX_VALUE);
            minInd = 0;
        }

        for (int j=0;j<arrayList1.size();j++)
            System.out.println(arrayList1.get(j));
    }
}
