import processing.core.PApplet;

import java.util.Random;

public class Ball {
    Random random = new Random();
    public Fenster window;
    double xPos;
    double yPos;
    double diameter;
    int color;
    double speed;
    double accel = 98.1;

    Ball(Fenster iWindow, double inputPositionX, double inputPositionY, double iDiameter, int iColor, double iSpeed) {
        window = iWindow;
        xPos = inputPositionX;
        yPos = inputPositionY;
        diameter = iDiameter;
        color = iColor;
        speed = iSpeed;
    }

    Ball(PApplet window) {
    }

    void male() {
        window.circle((float) xPos, (float) yPos, (float) diameter);
    }

    public void move(double t) {
        speed = speed + accel * t / window.frameRate;
        yPos = yPos + speed * t;
        if (yPos >= window.height - diameter / 2) {
            speed = -speed;
        }
    }
}
