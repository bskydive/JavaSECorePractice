package com.javarush.test.level13.lesson11.bonus03;

public class Robot extends AbstractRobot
{
    protected Robot(String name)
    {
        super(name);
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    @Override
    public void setName(String name)
    {
        super.setName(name);
    }

    @Override
    public BodyPart attack()
    {
        return super.attack();
    }

    @Override
    public BodyPart defense()
    {
        return super.defense();
    }
}
