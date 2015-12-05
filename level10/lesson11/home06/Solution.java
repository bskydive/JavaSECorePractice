package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String field1, field2, field3, field4;
        int field5;
        boolean field6;

        public Human(String field1, String field2)
        {
            this.field1 = field1;
            this.field2 = field2;
        }

        public Human(String field1, String field2, String field3)
        {
            this.field1 = field1;
            this.field2 = field2;
            this.field3 = field3;
        }

        public Human(String field1, String field2, String field3, String field4)
        {
            this.field1 = field1;
            this.field2 = field2;
            this.field3 = field3;
            this.field4 = field4;
        }

        public Human(String field1, String field2, String field3, String field4, int field5)
        {
            this.field1 = field1;
            this.field2 = field2;
            this.field3 = field3;
            this.field4 = field4;
            this.field5 = field5;
        }

        public Human(String field1, String field2, String field3, String field4, int field5, boolean field6)
        {
            this.field1 = field1;
            this.field2 = field2;
            this.field3 = field3;
            this.field4 = field4;
            this.field5 = field5;
            this.field6 = field6;
        }

//

        public Human(int field1, String field2)
        {
            this.field1 = Integer.toString(field1);
            this.field2 = field2;
        }

        public Human(int field1, String field2, String field3)
        {
            this.field1 = Integer.toString(field1);
            this.field2 = field2;
            this.field3 = field3;
        }

        public Human(int field1, String field2, String field3, String field4)
        {
            this.field1 = Integer.toString(field1);
            this.field2 = field2;
            this.field3 = field3;
            this.field4 = field4;
        }

        public Human(int field1, String field2, String field3, String field4, int field5)
        {
            this.field1 = Integer.toString(field1);
            this.field2 = field2;
            this.field3 = field3;
            this.field4 = field4;
            this.field5 = field5;
        }

        public Human(int field1, String field2, String field3, String field4, int field5, boolean field6)
        {
            this.field1 = Integer.toString(field1);
            this.field2 = field2;
            this.field3 = field3;
            this.field4 = field4;
            this.field5 = field5;
            this.field6 = field6;
        }

    }
}
