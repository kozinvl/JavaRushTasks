package com.javarush.task.task21.task2113;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by expertvl on 13.11.2017.
 */
public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public Hippodrome() {
    }

    public Hippodrome(List<Horse> horses) {

        this.horses = horses;
    }


    public List<Horse> getHorses() {

        return horses;
    }

    public void print() {
        for (Horse hors : horses) {
            hors.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


    public void move() {
        for (Horse hors : horses) {
            hors.move();
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse h : getHorses()) {
            if (h.getDistance() > winner.getDistance()) {
                winner = h;
            }

        }
        return winner;


    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        game.horses.add(new Horse("Horse1", 3, 0));
        game.horses.add(new Horse("Horse2", 3, 0));
        game.horses.add(new Horse("Horse3", 3, 0));
        game.run();
        game.printWinner();


    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

}
