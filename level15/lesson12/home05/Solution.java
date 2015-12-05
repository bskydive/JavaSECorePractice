package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(Object param,Object param1){ }
    public Solution(Object param,Object param1,Object param2){ }
    public Solution(Object param, Object param1, Object param2,Object param3){  }

    Solution(){ }
    Solution(String param,String param1,String param2){ }
    Solution(String param, String param1, String param2,String param3){  }

    private Solution(Integer param,Integer param1){ }
    private Solution(Integer param,Integer param1,Integer param2){ }
    private Solution(Integer param, Integer param1, Integer param2,Integer param3){  }

    protected Solution(Double param,Double param1){ }
    protected Solution(Double param,Double param1,Double param2){ }
    protected Solution(Double param, Double param1, Double param2,Double param3){  }


}

