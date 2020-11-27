package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Sun extends GraphicalObject {

    private int r;
    private int speed;
    private double light;

    public Sun(int pX, int pY, int pRadius, int pSpeed){

        x = pX;
        y = pY;
        r = pRadius;
        speed = pSpeed;


    }

    @Override
    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(225, 255, 0, 255);
        drawTool.drawFilledCircle(x, y, r);

    }

    @Override
    public void update(double dt){

        x = x+speed*dt;

        if(x > 1000){
            x = - 1000-r;
        }

        y = 0.001*(x-500)*(x-500)+100;

    }

    public double getLight(){

        light = (0.000004*(x-500)*(x-500));

        if(light>0.9){
            light=0.9;
        }else if(light<0){
            light=0;
        }

        return light;

    }

}
