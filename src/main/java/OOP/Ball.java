package OOP;

import processing.core.PApplet;

public class Ball {
    private int xCoordinate = 0;
    private final int height;
    private final int diameter = 10;
    private final int speed;

    public Ball(int height, int speed) {
        this.height = height;
        this.speed = speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(xCoordinate, height, diameter, diameter);
    }

    public void moveStraight() {
        xCoordinate += speed;
    }
}
