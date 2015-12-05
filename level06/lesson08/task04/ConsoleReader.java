package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{



    public static String readString() throws Exception
    {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String out = "";

        try {
            return inputReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return out;

    }

    public static int readInt() throws Exception
    {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int out = 0;
        try {
            out = Integer.parseInt(inputReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return out;
    }

    public static double readDouble() throws Exception
    {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        Double out = 0.0;

        try {
            out = Double.parseDouble(inputReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return out;

    }

    public static void readLn() throws Exception
    {

        readString();

    }
}
