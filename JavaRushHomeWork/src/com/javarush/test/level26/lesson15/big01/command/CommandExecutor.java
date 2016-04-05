package com.javarush.test.level26.lesson15.big01.command;

/**
 * Created by oleksiy.holyarchuk on 05.04.2016.
 */

import com.javarush.test.level26.lesson15.big01.Operation;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;
import java.util.HashMap;
import java.util.Map;

public class CommandExecutor
{
    public static Map<Operation, Command> map = new HashMap<>();
    static
    {
        map.put(Operation.LOGIN, new LoginCommand());
        map.put(Operation.INFO, new InfoCommand());
        map.put(Operation.DEPOSIT, new DepositCommand());
        map.put(Operation.WITHDRAW, new WithdrawCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws InterruptOperationException
    {
        map.get(operation).execute();
    }

    private CommandExecutor()
    {
    }

}