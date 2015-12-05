package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    @Override
    public boolean equals(Object obj)
    {
        boolean result=false;

        Solution n = (Solution) obj;
        if (n.first == null && n.last == null) result= true;
        if (n.first != null && n.last != null) result= n.first.equals(first) && n.last.equals(last);
        if (n.first == null && n.last != null) return false;
        if (n.first != null && n.last == null) return false;
        if (!(obj instanceof Solution)) result=false;
        if (n == null) return false;
        if (!n.getClass().equals( this.getClass() )) result=false;

        return result;
    }


    @Override
    public int hashCode() {

        int i=0,j=0;

        if (first != null ) i = first.hashCode();
        if (last != null ) j = last.hashCode();

        return 31*i + j;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));

        s.add(new Solution(null, "Duck"));
        System.out.println(s.contains(new Solution(null, "Duck")));

        s.add(new Solution(null, null));
        System.out.println(s.contains(new Solution(null, null)));
    }


}
