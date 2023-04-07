import processing.core.PApplet;
import java.util.Random;

public class Fenster extends PApplet {
    private Ball Ball;

    @Override
    public void settings() {
        size(800, 800);
        Ball = new Ball(this, 400, 400, 50, 50, 0);
    }

    @Override
    public void draw() {
        background(200);
        Ball.male();
        Ball.move(0.5);
    }
}
