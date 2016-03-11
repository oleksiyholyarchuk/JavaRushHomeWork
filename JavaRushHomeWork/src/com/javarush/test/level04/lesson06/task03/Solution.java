package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a>b && b>c) System.out.print(a + " " + b + " " + c);
        if (a>c && c>b) System.out.print(a + " " + c + " " + b);
        if (b>c && c>a) System.out.print(b + " " + c + " " + a);
        if (b>a && b>c) System.out.print(b + " " + a + " " + b);
        if (c>a && a>b) System.out.print(c + " " + a + " " + b);
        if (c>b && b>a) System.out.print(c + " " + b + " " + a);


        }
    }

