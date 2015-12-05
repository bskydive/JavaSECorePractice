package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args){

        IncomeData incomeData = new IncomeData()

        {
            @Override
            public String getCountryCode()
            {
                return "RU";
            }

            @Override
            public String getCompany()
            {
                return "JavaRush Ltd.";
            }

            @Override
            public String getContactFirstName()
            {
                return "Ivan";
            }

            @Override
            public String getContactLastName()
            {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode()
            {
                return 38;
            }

            @Override
            public int getPhoneNumber()
            {
                return 501234567;
            }
        };

        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(incomeData);
        System.out.println(incomeDataAdapter.getPhoneNumber());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getCompanyName());


    }


    public static class IncomeDataAdapter implements Customer,Contact{

        private IncomeData incomeData;


        public IncomeDataAdapter(IncomeData incomeDataIn)
        {
            this.incomeData =incomeDataIn;

        }

        @Override
        public String getName()
        {
            return this.incomeData.getContactLastName() +", " + this.incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber()
        {
            String countryCode = "+" + Integer.toString(this.incomeData.getCountryPhoneCode());
            String phoneNumber = String.format("%010d", this.incomeData.getPhoneNumber());

            return countryCode + "(" + phoneNumber.substring(0,3) + ")" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,8) + "-" + phoneNumber.substring(8);

        }

        @Override
        public String getCompanyName()
        {
            return this.incomeData.getCompany();
        }

        @Override
        public String getCountryName()
        {
            return countries.get(this.incomeData.getCountryCode());
        }
    }


    public static interface IncomeData{
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        int getCountryPhoneCode();      //example 38
        int getPhoneNumber();           //example 501234567


    }


    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}