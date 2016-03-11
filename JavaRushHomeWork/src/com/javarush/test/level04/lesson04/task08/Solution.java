package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first side: ");
        String side_1 = reader.readLine();
        int a = Integer.parseInt(side_1);

        System.out.println("Enter first side: ");
        String side_2 = reader.readLine();
        int b = Integer.parseInt(side_2);

        System.out.println("Enter first side: ");
        String side_3 = reader.readLine();
        int c = Integer.parseInt(side_3);

        if ( ((a + b) > c) && ((a + c)>b) && ((b+c)>a))
            System.out.println("Triangle exist");
        else
            System.out.println("Triangle doesn't exist");
*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a >= b + c || b >= a + c || c >= a + b)
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");

    }
}