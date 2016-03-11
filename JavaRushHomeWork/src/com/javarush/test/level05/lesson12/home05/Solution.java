package com.javarush.test.level05.lesson12.home05;
import java.io.*;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int a = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String s = reader.readLine();
            if (s.equals("сумма")) break;
            int b = Integer.parseInt(s);
            a = a + b;
        }
        System.out.println(a);



    }
}
