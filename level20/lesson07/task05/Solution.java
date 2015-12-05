package com.javarush.test.level20.lesson07.task05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Переопределение сериализации
Сделайте так, чтобы после десериализации нить runner продолжила работать.
Ключевые слова объекта runner менять нельзя.
Hint/Подсказка:
Конструктор не вызывается при сериализации, только инициализируются все поля.
*/

public class Solution implements Serializable, Runnable {
    public static final long serialVersionUID=1L;

    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        try
        {
            for (int i=0;i<10;i++) {
                Thread.sleep(10*speed);
                System.out.println("Tik spped:"+speed);
                Thread.sleep(10*speed);
                System.out.println("Tak speed:"+speed);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(speed);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.speed = in.readInt();
        runner = new Thread(this);
        runner.start();
    }
}
