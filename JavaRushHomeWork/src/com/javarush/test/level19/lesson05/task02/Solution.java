package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        // читаем имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        //вычитываем символы в строку
        String str = "";
        BufferedReader fin = new BufferedReader(new FileReader(fileName));
        while(fin.ready()) {
            str += fin.readLine() + " ";
        }
        fin.close();

        //ищем количество повторений слова в строке
        str = str.toLowerCase().replaceAll("[^a-z ]", " ");
        String find = "world";
        String[] words = str.split(" ");
        int count = 0;
        for(String tmp : words)
            if(tmp.equals(find))
                count++;

        System.out.println(count);
    }
}