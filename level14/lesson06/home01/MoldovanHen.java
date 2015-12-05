package com.javarush.test.level14.lesson06.home01;


class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth()
    {
        return 20;
    }
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+Integer.toString(getCountOfEggsPerMonth())+" яиц в месяц.";
    }
}

