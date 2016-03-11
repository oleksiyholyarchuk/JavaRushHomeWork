package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код

        HashSet<String> list = new HashSet<String>();

        list.add("Лиля");
        list.add("Люда");
        list.add("Лора");
        list.add("Люк");
        list.add("Лейкс");
        list.add("Лайка");
        list.add("Ложка");
        list.add("Лимон");
        list.add("Лопух");
        list.add("Лизун");
        list.add("Люфт");
        list.add("Лама");
        list.add("Лаунч");
        list.add("Лира");
        list.add("Лада");
        list.add("Лампочка");
        list.add("Люстра");
        list.add("Лиса");
        list.add("Лань");
        list.add("Лорд");
        return list;

    }
}
