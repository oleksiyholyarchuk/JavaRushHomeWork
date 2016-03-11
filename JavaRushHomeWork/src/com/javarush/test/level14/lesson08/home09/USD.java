package com.javarush.test.level14.lesson08.home09;

/**
 * Created by oleksiyholyarchuk on 2/23/16.
 */

public class USD extends Money
{
    public USD( double amount )
    {
        super( amount );
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}