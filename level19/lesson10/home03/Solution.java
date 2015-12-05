package com.javarush.test.level19.lesson10.home03;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args)
    {

        if (args==null || args.length<1) System.exit(1);

        Scanner inputFile=null;

        try{
            inputFile = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }


        Map<String,Date> map = new HashMap<>();

        String[] midStr;
        int maxInd=0;
        String name="";
        Date date;

        try{
            while (inputFile.hasNext()) {
                midStr = inputFile.nextLine().split(" ");
                maxInd = midStr.length;
                if (maxInd<3 || maxInd>6) continue;
                name = midStr[0];

                for (int i=1;i<maxInd-3;i++) name+=" "+midStr[i];

                try{
                    date = new SimpleDateFormat("dd MM yyyy").parse(midStr[maxInd-3]+" "+midStr[maxInd-2]+" "+midStr[maxInd-1] );
                    map.put(name, date);
                }catch (ParseException e)
                {
                }

            }

            for (Map.Entry<String,Date> m: map.entrySet()) {
                Person p = new Person(m.getKey(),m.getValue());
                PEOPLE.add(p);
            }
        }

        finally
        {
            inputFile.close();
        }

    }

}
