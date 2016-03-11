package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код

    String name, color;
    int heigth;

    public Dog (String name) {
        this.name = name;
    }

    public Dog (String name, int heigth) {
        this.name = name;
        this.color = color;
    }

    public Dog (String name, int heigth, String color) {
        this.name = name;
        this.heigth = heigth;
        this.color = color;
    }


}
