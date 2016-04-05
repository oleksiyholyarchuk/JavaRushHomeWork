package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static Integer[] sort(Integer[] array) {
        //implement logic here
        double median = 0;
        Integer[] secondArray = array;
        Arrays.sort(secondArray);
        if (secondArray.length%2==0) {
            int a = secondArray[(secondArray.length/2)-1];
            int b = secondArray[secondArray.length/2];
            median = (a+b)/2.0;
        }
        else if (secondArray.length%2==1) {median = secondArray[(secondArray.length/2)];}

        final double finalMedian = median;
        Comparator<Integer> comparator = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                int result =(int) ((Math.abs(o1- finalMedian)) - (Math.abs(o2 - finalMedian)));
                return result == 0 ? o1-o2 : result;
            }
        };
        Arrays.sort(array,comparator);


        return array;
    }

    public static void main(String[] args)
    {
        Integer[] first = new Integer[]{2, 5, 6, 7, 21, 1};
        Solution.sort(first);
        for (int i = 0; i < first.length; i++)
        {
            System.out.println(first[i]);
        }
    }
}