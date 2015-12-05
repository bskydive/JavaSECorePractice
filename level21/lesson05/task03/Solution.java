package com.javarush.test.level21.lesson05.task03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Ошибка в equals/hashCode
Исправьте ошибки реализаций методов equals и hashCode для класса Solution
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    public static void main(String[] args) {

        Date d=null,d1 = null;

        try
        {
            d = new SimpleDateFormat("dd MM yyyy").parse("01 01 2001");
            d1 = new SimpleDateFormat("dd MM yyyy").parse("02 02 2002");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        System.out.println((new Solution(1,"1",2d,d,null).equals(new Solution(1,"1",2d,d,null)))); //true
        System.out.println((new Solution(1,"1",2d,d,null).equals(new Solution(1,"1",3d,d,null)))); //false
        System.out.println((new Solution(1,"1",2d,d,null).equals(new Solution(2,"1",2d,null,null)))); //false
        System.out.println((new Solution(1,"1",2d,d,null).equals(new Solution(1,null,2d,null,null)))); //false
        System.out.println((new Solution(1,"1",2d,d,null).equals(new Solution(1,"1",2d,d1,null)))); //false
        System.out.println((new Solution(1,null,2d,null,null).equals(new Solution(1,null,2d,null,null)))); //true


        System.out.println((new Solution(1,"1",2d,d,null).hashCode()==(new Solution(1,"1",2d,d,null)).hashCode())); //true
        System.out.println((new Solution(1,"1",2d,d,null).hashCode()==(new Solution(1,"1",3d,d,null)).hashCode())); //false
        System.out.println((new Solution(1,"1",2d,d,null).hashCode()==(new Solution(2,"1",2d,null,null)).hashCode())); //false
        System.out.println((new Solution(1,"1",2d,d,null).hashCode()==(new Solution(1,null,2d,null,null)).hashCode())); //false
        System.out.println((new Solution(1,"1",2d,d,null).hashCode()==(new Solution(1,"1",2d,d1,null)).hashCode())); //false
        System.out.println((new Solution(1,null,2d,null,null).hashCode()==(new Solution(1,null,2d,null,null)).hashCode())); //true
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution1 = (Solution) o;

        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date != null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution != null) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = anInt;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (string != null ? string.hashCode() : 0);
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }
}
