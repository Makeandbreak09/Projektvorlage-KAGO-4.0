package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Cloud extends GraphicalObject {

    private int r;
    private double speed;
    private double richtung;
    private double light;
    private Sun sun;

    private double startPosX;
    private double startPosY;

    public Cloud(int pX, int pY, int r, Sun sun){

        x = pX;
        y = pY;
        x = x-r/2;
        y = y-r/2;

        startPosX = x;
        startPosY = y;

        this.r = r;
        speed = (int) (Math.random()*50+50);
        this.sun = sun;

        if((int) (Math.random()*100) <= 50){
            richtung = -1;
        }else{
            richtung = 1;
        }

    }

    @Override
    public void draw(DrawTool drawTool){
        light = sun.getLight();

        drawTool.setCurrentColor(200, 200, 200, 150);
        drawTool.drawFilledCircle(x+r*0/7, y+r*1/7, r*3/7);
        drawTool.drawFilledCircle(x+r*2/7, y+r*1/7, r*3/7);
        drawTool.drawFilledCircle(x+r*4/7, y+r*1/7, r*3/7);
        drawTool.drawFilledCircle(x+r*1/7, y+r*3/7, r*3/7);
        drawTool.drawFilledCircle(x+r*3/7, y+r*3/7, r*3/7);

    }

    @Override
    public void update(double dt) {

        x = x-speed*richtung*dt;

        y = Math.sin((x-startPosX)/50)*100 + startPosY;

    }

    public boolean checkPos(){
        if(x+r <= 0 && richtung >= 0){
            return true;
        }else if(x >= 1000 && richtung <= 0){
            return true;
        }
        return false;
    }
}
