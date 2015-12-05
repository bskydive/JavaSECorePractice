package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("/tmp/temp"));
        PersonScanner adapter = new PersonScannerAdapter(s);
        System.out.println(adapter.read());
        adapter.close();
    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner sc;

        public PersonScannerAdapter(Scanner sc)
        {
            this.sc = sc;
        }

        @Override
        public Person read() throws IOException
        {
            ArrayList<String> list = new ArrayList<String>();
            String last="",first="",middle="";
            int day=1,month=1,year=1970;

            if (sc.hasNext()) last = sc.next();
            if (sc.hasNext()) first = sc.next();
            if (sc.hasNext()) middle = sc.next();
            if (sc.hasNext()) day = sc.nextInt();
            if (sc.hasNext()) month = sc.nextInt()-1;
            if (sc.hasNext()) year = sc.nextInt();

            Calendar date = new GregorianCalendar(year, month, day);

            return new Person(first, middle, last,date.getTime());
        }

        @Override
        public void close() throws IOException
        {
            sc.close();
        }
    }
}
