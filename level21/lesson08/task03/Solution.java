package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Запретите клонировать класс B
Разрешите клонировать класс C
*/
public class Solution {


    public static void main(String[] args){

        try {

            A a1 = new A(1,2);
            A a2 = a1.clone();
            System.out.println(a1);
            System.out.println(a2);

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        try {
            B b1 = new B(1,2,"3");
            B b2 = b1.clone();
            System.out.println(b1);
            System.out.println(b2);

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        try {
            C c1 = new C(1,2,"3");
            C c2 = c1.clone();
            System.out.println(c1);
            System.out.println(c2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }


    }

    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected A clone() throws CloneNotSupportedException
        {
            return new A(getI(),getJ());
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected B clone() throws CloneNotSupportedException
        {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B implements Cloneable{
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected C clone() throws CloneNotSupportedException
        {
            C c = new C(this.getI(),this.getJ(),this.getName());
            return c;
        }
    }
}
