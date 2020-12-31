import processing.core.PApplet;

public class ProcessingAssignmentOOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball ball1 = new Ball(HEIGHT / 5);
    Ball ball2 = new Ball(2 * HEIGHT / 5);
    Ball ball3 = new Ball(3 * HEIGHT / 5);
    Ball ball4 = new Ball(4 * HEIGHT / 5);

    public static void main(String[] args) {
        PApplet.main("ProcessingAssignmentOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        ball1.drawBall(1);
        ball2.drawBall(2);
        ball3.drawBall(3);
        ball4.drawBall(4);
    }

    private class Ball {
        private int x = 0;
        private int height;
        private final int diameter = 10;

        public Ball(int height) {
            this.height = height;
        }

        public void drawBall(int speed) {
            ellipse(x, height, diameter, diameter);
            setX(speed);
        }

        private void setX(int speed) {
            x += speed;
        }
    }
}
