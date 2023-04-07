public class Ball {
    static Fenster window;
    double xPos;
    double yPos;
    double diameter;
    int color;
    double speed;
    double accel;

    Ball(Fenster iWindow, double inputPositionX, double inputPositionY, double iDiameter, int iColor, double iSpeed) {
        iWindow = window;
        inputPositionX = xPos;
        inputPositionY = yPos;
        iDiameter = diameter;
        iColor = color;
        iSpeed = speed;
    }

    static void male() {
        window.circle(100.0f, 100.0f, 50);
    }
}
