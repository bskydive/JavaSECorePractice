package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Сигнатуру метода main не менять.  Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> allLinesSafe = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException
     {

         BufferedReader reader=null;
         String sourceFileNameAll,sourceFileNameRemove;

         try{
             reader = new BufferedReader(new InputStreamReader(System.in));

             sourceFileNameAll = reader.readLine();
             sourceFileNameRemove = reader.readLine();

             allLines = ReadFileStrings(sourceFileNameAll);
             allLinesSafe.addAll(allLines);
             forRemoveLines = ReadFileStrings(sourceFileNameRemove);

             reader.close();
         } catch (IOException e) {
             e.printStackTrace();
         }

         new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {


         if (allLinesSafe.containsAll(forRemoveLines)) {
            if (allLinesSafe.removeAll(forRemoveLines)) allLines=allLinesSafe;
        } else {
            allLinesSafe.clear();
            allLines=allLinesSafe;
            throw new CorruptedDataException();


        }


    }

    private static List<String> ReadFileStrings(String sourceFileName)
    {
        Scanner fileReader= null;
        List<String> stringsFromFile = new ArrayList<String>();

        try{
            fileReader = new Scanner(new File(sourceFileName));
            if (fileReader.hasNext()) stringsFromFile.add(fileReader.nextLine());
            while (fileReader.hasNext()) stringsFromFile.add(fileReader.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally
        {
            fileReader.close();
        }

        return stringsFromFile;
    }


}
