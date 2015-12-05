package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome
{
    public static ArrayList<Horse> horses =new ArrayList<Horse>();

    public static Hippodrome game;


    public static void main(String[] args){

        game = new Hippodrome();
        Horse horse1 = new Horse("horse1",3.0,0.0);
        Horse horse2 = new Horse("horse2",3.0,0.0);
        Horse horse3 = new Horse("horse3",3.0,0.0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game.run();

        game.printWinner();
    }

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses)
    {
        this.horses = horses;
    }

    public void run()
    {
        for (int i=0;i<100;i++){

            move();
            print();

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner(){


        double distanceWin = 0.0;
        int indexWin=0;

        for (int i=0;i<getHorses().size();i++){
            if (getHorses().get(i).distance>=distanceWin) indexWin=i;
        }

        return getHorses().get(indexWin);
    }

    public void printWinner(){

        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    public void move(){

        for (int i=0;i<getHorses().size();i++){
            if (getHorses().get(i)!=null) getHorses().get(i).move();
        }
    }

    public void print(){
        for (int i=0;i<getHorses().size();i++){
            if (getHorses().get(i)!=null) getHorses().get(i).print();
        }
        System.out.println();
        System.out.println();
    }

}
