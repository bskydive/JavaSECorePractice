package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример, "мор"-"ром", "трос"-"сорт"
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {

        BufferedReader inputReader=null;
        BufferedReader bufferedReader = null;

        String inStr = "",reversedStr = "",outStr="";
        String[] allStr = null;
        StringBuilder sb = null;
        int indexWordFw=-1,indexWordRw=-1;

        try {
            inputReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputReader.readLine())));

            while (bufferedReader.ready()){
                inStr += bufferedReader.readLine()+" ";

            }

            bufferedReader.close();
            inputReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        allStr = inStr.split(" ");
        sb = new StringBuilder(inStr);

        for (int i=0;i<allStr.length;i++){
            reversedStr = (new StringBuilder(allStr[i]) ).reverse().toString();
            indexWordFw=-1;
            indexWordRw=-1;

            if (indexWordFw==indexWordRw) indexWordRw=sb.indexOf(reversedStr,indexWordRw+1);
            for (int j=0;j<allStr.length;j++){
                if (i==j) continue;

                if (allStr[j].equals(reversedStr)) {
                    indexWordRw=j;
                    break;
                }
            }

            if (indexWordRw>=0 && !outStr.contains(" "+allStr[i]+" ") && !outStr.contains(" "+reversedStr+" ") && allStr.length>0 && !allStr[i].isEmpty()) {
                outStr += allStr[i]+" ";
                allStr[i]="";
                allStr[indexWordRw]="";
            }

        }

        allStr = outStr.split(" ");

        for (int i=0;i<allStr.length;i++) {
            reversedStr = (new StringBuilder(allStr[i]) ).reverse().toString();
            result.add(new Pair(allStr[i],reversedStr));
        }

        for (Pair pr : result)
        {
            System.out.println(String.format("\"%s\" - \"%s\"",pr.first, pr.second));
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }
    }

}

