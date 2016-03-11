package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by oleksiyholyarchuk on 2/23/16.
 */

public class Singleton
{
    static Singleton INSTANCE = null;
    private Singleton() {}

    static Singleton getInstance() {
        if (INSTANCE==null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}