package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Stern extends GraphicalObject{

    private double light;
    private Sun sun;

    public Stern(int x, int y, Sun sun){

        this.x = x;
        this.y = y;
        this.sun = sun;
        light = sun.getLight();


    }

    @Override
    public  void draw(DrawTool drawTool){
        light = sun.getLight();

        drawTool.setCurrentColor(new Color(255, 255, 0, (int) Math.round(255*light*Math.random())));
        drawTool.drawFilledCircle(x, y, 5/2);

    }

    @Override
    public void update(double dt) {

    }
}
