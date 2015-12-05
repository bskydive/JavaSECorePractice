package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] i = new int[3];
            i[4]=0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int i = Integer.parseInt("none");

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object o = null;
            o.hashCode();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            new FileReader("none");

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            long d = Date.parse("none");

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Date date = new SimpleDateFormat("dd MM yyyy").parse("");

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            FileWriter f = new FileWriter("tmp");
            f.close();
            f.write(0);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            ArrayList<Integer> i = new ArrayList<Integer>();
            i.get(2);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            "1".charAt(3);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
