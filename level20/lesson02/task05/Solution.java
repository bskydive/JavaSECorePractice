package com.javarush.test.level20.lesson02.task05;

import java.io.*;

/* И еще раз о синхронизации
Реализуйте логику записи в файл и чтения из файла для класса Object
Метод load должен инициализировать объект данными из файла
Метод main реализован только для вас и не участвует в тестировании
*/

public class Solution {
    public static void main(java.lang.String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Object object = new Object();
            object.string1 = new String();   //string #1
            object.string2 = new String();   //string #2
            object.save(outputStream);
            outputStream.flush();

            Object loadedObject = new Object();
            loadedObject.string1 = new String(); //string #3
            loadedObject.string2 = new String(); //string #4


            loadedObject.load(inputStream);
            if (object.string1.number==loadedObject.string1.number) System.out.println("OK");
            if (object.string2.number==loadedObject.string2.number) System.out.println("OK");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Object {
        public String string1;
        public String string2;

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter=null;
            try{

                printWriter = new PrintWriter(outputStream);
                printWriter.println(string1.number);
                printWriter.println(string2.number);
            }finally
            {
                printWriter.flush();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader=null;
            Integer cntStr=0,before=countStrings;

            try {
                reader = new BufferedReader(new InputStreamReader(inputStream));

                try{
                    if (reader.ready()) countStrings=Integer.parseInt(reader.readLine())-1;
                    if (countStrings>=0) string1=new String();

                    if (reader.ready()) countStrings=Integer.parseInt(reader.readLine())-1;
                    if (countStrings>=0) string2=new String();

                    countStrings=before;

                } catch (NumberFormatException e){
                    e.printStackTrace();
                }

            }finally
            {
                //reader.close();
            }

        }
    }

    public static int countStrings;

    public static class String {
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
}
