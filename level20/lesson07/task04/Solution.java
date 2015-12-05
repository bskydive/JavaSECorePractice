package com.javarush.test.level20.lesson07.task04;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Externalizable Solution
Сериализуйте класс Solution.
Подумайте, какие поля не нужно сериализовать.
Объект всегда должен содержать актуальные на сегодняшний день данные.
*/
public class Solution implements Serializable{

    public static void main(String[] args)
    {
        System.out.println(new Solution(4));

        try{

            File your_file_name = File.createTempFile("your_file_name", null);
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(your_file_name));
            ObjectInputStream inputStream =  new ObjectInputStream(new FileInputStream(your_file_name));

            Solution savedObject = new Solution(6);
            outputStream.writeObject(savedObject);
            outputStream.flush();

            Solution loadedObject=new Solution(7);
            loadedObject = (Solution) inputStream.readObject();

            if (savedObject.string.equals(loadedObject.string)) System.out.println("string loaded OK");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;


    public Solution(int temperature) {

        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

}
