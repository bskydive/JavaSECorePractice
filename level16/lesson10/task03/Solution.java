package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread1 = new TestThread();
        testThread1.start();
        testThread1.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        @Override
        public void run()
        {
            try {
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println("2");
            } catch (InterruptedException e) {

            }
        }
    }
}
