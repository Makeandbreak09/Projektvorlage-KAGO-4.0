package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Mond extends GraphicalObject {

    private int r;
    private int speed;

    public Mond(int pX, int pY, int pRadius, int pSpeed){

        x = pX;
        y = pY;
        r = pRadius;
        speed = pSpeed;


    }

    @Override
    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(new Color(100, 100, 100, 255));
        drawTool.drawFilledCircle(x, y, r);


    }

    @Override
    public void update(double dt){

        x = x+speed*dt;

        if(x > 1000){

            x = -1000-r;

        }

        y = 0.001*(x-500)*(x-500)+100;

    }


}
