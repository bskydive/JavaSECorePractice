package com.javarush.test.level14.lesson06.home01;

class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth()
    {
        return 30;
    }
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+Integer.toString(getCountOfEggsPerMonth())+" яиц в месяц.";
    }
}
