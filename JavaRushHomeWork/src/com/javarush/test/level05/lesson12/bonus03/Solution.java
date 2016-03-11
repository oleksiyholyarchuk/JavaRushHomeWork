package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/



public class Solution {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(reader.readLine());
        if (max > 0){
            int result=0;
            for (int i = 0; i < max; i++)
            {
                int num;
                int a;
                if (i==0)
                {
                    num = Integer.parseInt(reader.readLine());
                    a = num;
                }
                else {
                    num = Integer.parseInt(reader.readLine());
                    a = result;
                }
                result = num >= a ? num : a;
            }
            int maximum = result;
            System.out.println(maximum);
        }
    } }