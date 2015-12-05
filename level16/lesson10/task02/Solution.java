package com.javarush.test.level16.lesson10.task02;

/* Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды и более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для countSeconds=4 : [4 3 2 1 Прервано!]
4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 : [3 2 1 Марш!]
PS: метод sleep выбрасывает InterruptedException.
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        try {
            for (int i=7;i>=0;i--)
            {
                Thread.sleep(500);
            }
            clock.interrupt();
        } catch (InterruptedException e) {

        }
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                for (int i=countSeconds;i>0;i--)
                {
                    System.out.print(i+" ");
                    Thread.sleep(1000);
                }
                System.out.println("Марш!");
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }

        }
    }
}