package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
/*--------------Put file names to list------------------------*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stopInput = false;
        String fileToList;
        TreeMap<Integer, String> fileList = new TreeMap<Integer, String>();
        while (!stopInput)
        {
            fileToList = reader.readLine();
            if (fileToList.equals("end"))
            {
                stopInput = true;
            } else
            {
                try
                {
                    fileList.put(getPartNum(fileToList), fileToList);
                }
                catch (Exception e)
                {
                }
            }
        }
        reader.close();
        String finalFileName = getOrigFile(fileList);
        //File finalFile = new File(finalFileName);
        FileOutputStream toFile = null;
        FileInputStream fileInputStream = null;
        try {
            toFile=new FileOutputStream(finalFileName,true);
            byte[]bytes = new byte[1024];
            for (Map.Entry<Integer,String> entry :fileList.entrySet()) {
                fileInputStream = new FileInputStream(entry.getValue());
                while (fileInputStream.available()>0)
                {
                    int count = fileInputStream.read(bytes);
                    toFile.write(bytes, 0, count);
                }
            }}
        catch (IOException e) {}
        finally
        {
            fileInputStream.close();
            toFile.close();
        }
    }

    public static int getPartNum(String givenName)
    {
        int i = givenName.lastIndexOf(".part");
        return Integer.parseInt(givenName.substring(i + 5));
    }

    public static String getOrigFile(TreeMap<Integer,String> someMap)
    {
        String someName = someMap.firstEntry().getValue();
        return someName.substring(0,someName.indexOf(".part"));
    }
}