package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution
{
    public static void main(String[] args)
    {

    }
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass
    {

    }

    public static Solution[] getTwoSolutions()
    {
        Solution solutionOne = new Solution();
        Solution solutionTwo = new Solution();
        Solution.InnerClass solutionInnerClassOne = solutionOne.new InnerClass();
        Solution.InnerClass solutionInnerClassTwo= solutionTwo.new InnerClass();
        solutionOne.innerClasses[0] = solutionInnerClassOne ;
        solutionOne.innerClasses[1] = solutionInnerClassOne ;
        solutionTwo.innerClasses[0] = solutionInnerClassTwo;
        solutionTwo.innerClasses[1] = solutionInnerClassTwo;

        Solution[] result = {
                solutionOne, solutionTwo
        };

        return result;
    }
}