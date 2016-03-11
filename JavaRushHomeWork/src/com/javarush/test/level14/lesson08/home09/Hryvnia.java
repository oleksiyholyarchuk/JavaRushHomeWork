package com.javarush.test.level14.lesson08.home09;

/**
 * Created by oleksiyholyarchuk on 2/23/16.
 */

public class Hryvnia extends Money
{
    public Hryvnia( double amount )
    {
        super( amount );
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}