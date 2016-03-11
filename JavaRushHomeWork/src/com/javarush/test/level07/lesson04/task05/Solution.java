package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int [20];

        for (int i = 0; i < list.length; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }

        int [] arr1 = new int [10];
        int [] arr2 = new int [10];

        /*for (int i = 0; i <list.length-10; i++) {
            arr1[i] = list[i];
        }

        for (int i = 10; i <list.length; i++) {
            arr2[i] = list[i];
        }*/

        System.arraycopy(list, 0, arr1, 0, 10);
        System.arraycopy(list, 10, arr2, 0, 10);

        for (int i = 0; i <arr2.length; i++) {
            System.out.println(arr2[i]);
        }


    }
}
