package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("sss\t\t hhhh"));
    }
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null) {
            throw new TooShortStringException();
        }
        int one = string.indexOf('\t');
        int two = string.indexOf('\t', one+1);
        if (two== -1|| one == -1) throw new  TooShortStringException();
        return string.substring(one+1,two);
    }

    public static class TooShortStringException extends Exception {
    }
}
