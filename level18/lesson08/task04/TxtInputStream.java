package com.javarush.test.level18.lesson08.task04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* UnsupportedFileName
Измените класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt)
Например, first.txt или name.1.part3.txt
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException
*/

public class TxtInputStream extends FileInputStream{


    public TxtInputStream(String name) throws FileNotFoundException, UnsupportedFileNameException
    {
        super(name);
        if(!(getExtentions(name)).equals("txt"))
            throw new UnsupportedFileNameException();


    }

    public String getExtentions(String name){

        if(name.contains("."))
        {
            String[] ext = name.split("\\.");
            return ext[ext.length-1];
        }
        else return "No extention";
    }



}

