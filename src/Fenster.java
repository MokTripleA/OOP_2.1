import processing.core.PApplet;

public class Fenster extends PApplet {

    @Override
    public void settings() {
        size(800, 800);
        new Ball(this, 400, 400, 50, 50, 5);
    }

    @Override
    public void draw() {
        background(200);
    }
}
