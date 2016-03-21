package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by oleksiy.holyarchuk on 21.03.2016.
 */
public class Hippodrome
{
    private ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main (String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Chapaev", 3, 0));
        game.getHorses().add(new Horse("Pet'ka", 3, 0));
        game.getHorses().add(new Horse("Anka", 3, 0));
        game.run();
        game.printWinner();
    }

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void move () {
        for (Horse currentHorse : horses)
            currentHorse.move();
    }

    public void print() {
        for (Horse currentHorse : horses)
            currentHorse.print();
        System.out.println();
        System.out.println();
    }

    public void run() throws InterruptedException
    {
        for (int i = 0 ; i < 100; i++) {
            move();
            print();
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

}
