package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by oleksiy.holyarchuk on 27.02.2016.
 */

public class Plane implements Flyable
{
    private int pasenger;

    public Plane(int pasenger)
    {
        this.pasenger = pasenger;
    }

    @Override
    public void fly()
    {

    }
}