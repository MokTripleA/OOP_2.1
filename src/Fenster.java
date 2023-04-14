import processing.core.PApplet;

import java.util.Random;

public class Fenster extends PApplet {
    Random random = new Random();
    Ball[] Ball = new Ball[50];

    @Override
    public void settings() {
        size(800, 800);
        for (int x = 0; x < Ball.length; x++) {
            Ball[x] = new Ball(this);
        }
    }

    @Override
    public void draw() {
        background(200, 100, 100);
        for (int x = 0; x < Ball.length; x++) {
            Ball[x].male();
            Ball[x].move(1 / frameRate);
        }
    }
}
