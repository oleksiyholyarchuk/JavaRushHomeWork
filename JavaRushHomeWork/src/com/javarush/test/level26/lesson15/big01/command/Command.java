package com.javarush.test.level26.lesson15.big01.command;

/**
 * Created by oleksiy.holyarchuk on 05.04.2016.
 */

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;


interface Command
{
    void execute()  throws InterruptOperationException;
}