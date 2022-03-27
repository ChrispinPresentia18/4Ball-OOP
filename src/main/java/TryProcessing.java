import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int[] x = {0,0,0,0};
    final int[] speed = {1,2,3,4};

    public static void main(String[] args){ PApplet.main("TryProcessing", args); }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBalls();
    }

    private void drawBalls() {
            for(int ball = 0; ball<4 ;ball++){
                ellipse(x[ball]+=speed[ball], getY(ball), DIAMETER, DIAMETER);
        }
    }

    private int getY(int ball) {
        return HEIGHT * (ball +1) / 5;
    }
}

