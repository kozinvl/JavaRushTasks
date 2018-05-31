package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expertvl on 19.11.2017.
 */
public class Snake {
    private List<SnakeSection> sections;

    private boolean isAlive;
    private SnakeDirection direction;

    public Snake (int x, int y) {
        this.sections = new ArrayList<>();
        this.isAlive = true;
        SnakeSection snakeSection = new SnakeSection(x, y);
        sections.add(snakeSection);
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
    public void move() {}
    public int getX() {
        return sections.get(0).getX();
    }
    public int getY() {
        return sections.get(0).getY();
    }
}

