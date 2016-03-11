package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
// Т.К. b типа Integer, то сработает метод именно с Integer
        Integer b = 9;
        print(9);
        print(b.hashCode());
    }

    //Напишите тут ваши методы
    public static void print (Integer i){

    }
    public static void print (int i){

    }

}
