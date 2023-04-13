import processing.core.PApplet;

import java.util.Random;

public class Fenster extends PApplet {
    Random random = new Random();
    Ball[] Ball = new Ball[random.nextInt(50)];

    @Override
    public void settings() {
        size(800, 800);
        for (int x = 0; x < Ball.length; x++) {
            Ball[x] = new Ball(this);
            System.out.println("Diameter: " + Ball[x].diameter); //Arrays befüllen klappt super, wie malen?
        }
    }

    @Override
    public void draw() {
        background(200, 100, 100);
    }
}
