package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
*/
public class Solution {


    public static void main(String[] args){
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java.")+"|");
        System.out.println(getPartOfString("JavaRush - лучшийсервисобученияJava.")+"|");
    }

    public static String getPartOfString(String string) {
        int indexSpace=0;

        if (string==null ) throw new TooShortStringException();
        if (string.isEmpty() ) throw new TooShortStringException();
        if (string.length()<5 ) throw new TooShortStringException();

            for (int i=0;i<5;i++) {

                if (string.indexOf(" ",indexSpace)<0) throw new TooShortStringException();

                indexSpace=string.indexOf(" ",indexSpace)+1;

            }

            return string.substring(string.indexOf(" ")+1,indexSpace-1);


    }

    public static class TooShortStringException extends RuntimeException{
    }
}
