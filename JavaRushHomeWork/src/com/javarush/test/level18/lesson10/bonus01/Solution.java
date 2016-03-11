package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        String key = args[0];
        String fileInputName = args[1];
        String fileOutputName = args[2];
        FileInputStream fileInputStream = new FileInputStream(fileInputName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        if ("-e".equals(key)) {
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                if (data == 0xFF) data = 0x00;
                else data++;
                fileOutputStream.write(data);
            }
        }
        else if ("-d".equals(key)) {
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                if (data == 0x00) data = 0xFF;
                else data--;
                fileOutputStream.write(data);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("Выполнено!");
    }
}