import processing.core.PApplet;

import java.util.Random;

public class Ball {
    Random random = new Random();
    private Fenster window;
    private double xPos;
    private double yPos;
    private double diameter;
    private int color_1;
    private int color_2;
    private int color_3;
    private double speed;
    private double speed_2 = 10;
    final double accel = 98.1;

    Ball(Fenster iWindow, double inputPositionX, double inputPositionY, double iDiameter, int iColor_1, int iColor_2, int iColor_3, double iSpeed) {
        window = iWindow;
        xPos = inputPositionX;
        yPos = inputPositionY;
        diameter = iDiameter;
        color_1 = iColor_1;
        color_2 = iColor_2;
        color_3 = iColor_3;
        speed = iSpeed;
    }

    Ball(PApplet window) {
        this.window = (Fenster) window;
        xPos = window.random(200, 600);
        yPos = window.random(200, 600);
        diameter = window.random(100, 200);
        color_1 = (int) window.random(255);
        color_2 = (int) window.random(255);
        color_3 = (int) window.random(255);
        speed = 0;
    }

    void male() {
        window.fill(color_1, color_2, color_3);
        window.ellipse((float) xPos, (float) yPos, (float) diameter, (float) diameter);
    }

    void move(double t) {
        speed = speed + accel * t;
        yPos = yPos + speed * t;
        xPos = xPos + speed_2;
        if (yPos > window.height - diameter / 2) {
            speed = -speed;
        }
        if (xPos > window.width - diameter / 2 || xPos < 0 + diameter / 2) {
            speed_2 = -speed_2;
        }
    }
}
