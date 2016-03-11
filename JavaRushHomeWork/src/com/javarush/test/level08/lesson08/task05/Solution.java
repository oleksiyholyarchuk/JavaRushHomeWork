package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("chaschin", "dmitro");
        map.put("norris", "chak");
        map.put("lee", "brus");
        map.put("villis", "brus");
        map.put("solunskiy", "dmitro");
        map.put("porox", "petya");
        map.put("yanik", "vitya");
        map.put("avakov", "arsen");
        map.put("chan", "jekki");
        map.put("ivanov", "ivan");
        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        ArrayList<String> d = new ArrayList<String>();
        for (Map.Entry<String, String> pair : map.entrySet()) d.add(pair.getValue());
        for (int i = 0; i < d.size(); )
        {
            int count = 0;
            for (int j = 0; j < d.size(); j++)
            {
                if ((d.get(i).equals(d.get(j))) && i != j) count++;
            }
            if (count == 0) d.remove(i);
            else i++;
        }
        for (int k = 0; k < d.size(); k++)
        {
            removeItemFromMapByValue(map, d.get(k));
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
