import processing.core.PApplet;

public class ProcessingAssignment extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int xBall1 = 0;
    int xBall2 = 0;
    int xBall3 = 0;
    int xBall4 = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingAssignment", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        xBall1 = drawBall(xBall1, HEIGHT / 5, 1);
        xBall2 = drawBall(xBall2, 2 * HEIGHT / 5, 2);
        xBall3 = drawBall(xBall3, 3 * HEIGHT / 5, 3);
        xBall4 = drawBall(xBall4, 4 * HEIGHT / 5, 4);
    }

    private int drawBall(int xCoordinate, int height, int speed) {
        ellipse(xCoordinate, height, DIAMETER, DIAMETER);
        xCoordinate += speed;

        return xCoordinate;
    }
}
