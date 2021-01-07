package OOP;

import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class ProcessingAssignmentOOP extends PApplet {

    final int WIDTH = 640;
    final int HEIGHT = 480;

    List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("OOP.ProcessingAssignmentOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Ball ball1 = new Ball(HEIGHT / 5, 1);
        Ball ball2 = new Ball(2 * HEIGHT / 5, 2);
        Ball ball3 = new Ball(3 * HEIGHT / 5, 3);
        Ball ball4 = new Ball(4 * HEIGHT / 5, 4);

        balls = Arrays.asList(ball1,ball2,ball3,ball4);
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.draw(this));
        balls.forEach(Ball::moveStraight);
    }
}

