package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String blaka = reader.readLine();
        int num = Integer.parseInt(blaka); //напишите тут ваш код
        if(num>=0)
            num = num * 2;
        else
            num = num + 1;
        System.out.println(num);

    }

}