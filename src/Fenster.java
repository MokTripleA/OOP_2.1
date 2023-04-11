import processing.core.PApplet;

import java.util.Random;

public class Fenster extends PApplet {
    Ball Ball;
    Random random = new Random();

    @Override
    public void settings() {
        size(800, 800);
        Ball = new Ball(this);
    }

    @Override
    public void draw() {
        background(200);
        Ball.male();
        Ball.move(0.5);
    }
}
