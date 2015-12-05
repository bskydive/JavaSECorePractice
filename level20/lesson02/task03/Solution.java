package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader reader;
        InputStream input = null;

        try{
            reader = new BufferedReader(new InputStreamReader(System.in));

            input = new FileInputStream(reader.readLine());
            load(input);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();

        for (Map.Entry<String,String> p : properties.entrySet()){
            prop.setProperty(p.getKey(),p.getValue());
        }

        prop.store(outputStream,"v20.2.3");

    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();

        prop.load(inputStream);

        for (Map.Entry<Object, Object> m : prop.entrySet()){
            properties.put(m.getKey().toString(),m.getValue().toString());
        }

    }
}
