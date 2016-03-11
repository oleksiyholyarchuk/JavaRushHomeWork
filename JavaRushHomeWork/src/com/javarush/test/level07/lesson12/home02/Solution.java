package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();

        //System.out.println("Enter N: ");
        int n = Integer.parseInt(reader.readLine());

        //System.out.println("Enter M: ");
        int m = Integer.parseInt(reader.readLine());

        //System.out.println("Enter N strings: ");
        for(int i = 0; i < n; i++)
        {
            list.add(reader.readLine());
        }

        for (int i = 0; i < m; i++)
        {
            list.add(list.get(0));
            list.remove(0);
        }

        //System.out.println("Replacement completed: ");
        for (String x: list) {
            System.out.println(x);
        }

    }
}
