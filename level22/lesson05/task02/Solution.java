package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {



    public static String getPartOfString(String string) throws TooShortStringException
    {
        int indexTab=0,indexTab2=0;

        if (string==null ) throw new TooShortStringException();
        if (string.isEmpty() ) throw new TooShortStringException();
        if (string.length()<2 ) throw new TooShortStringException();

        indexTab=string.indexOf("\t");
        indexTab2=string.indexOf("\t",indexTab+1);

        if (indexTab<0 || indexTab2<0 ) throw new TooShortStringException();

        return string.substring(string.indexOf("\t")+1,indexTab2);



    }

    public static class TooShortStringException extends Exception {
    }
}
