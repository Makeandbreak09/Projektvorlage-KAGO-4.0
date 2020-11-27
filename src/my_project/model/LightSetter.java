package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class LightSetter extends GraphicalObject{

    private double light;
    private Sun sun;

    public LightSetter(int pX, int pY, int pWidth, int pHeight, Sun sun){

        x = pX;
        y = pY;
        width = pWidth;
        height = pHeight;
        this.sun = sun;


    }

    @Override
    public void draw(DrawTool drawTool){
        updateLight(sun);

        drawTool.setCurrentColor(new Color(0, 0, 0, (int) Math.round(255*light)));
        drawTool.drawFilledRectangle(x, y, width, height);
    }

    @Override
    public void update(double dt){



    }

    public void updateLight(Sun sun){
        light = sun.getLight();
    }


}
