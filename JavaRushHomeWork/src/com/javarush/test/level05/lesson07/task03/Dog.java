package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код

    String name, color = null;
    int height = 0;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, String color, int height)
    {
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
