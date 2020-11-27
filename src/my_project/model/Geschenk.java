package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Geschenk extends GraphicalObject{


    public Geschenk(int x, int y, int width, int height){

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;


    }

    @Override
    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(new Color(145, 0, 0, 255));
        drawTool.drawFilledRectangle(x, y, width, height);
        drawTool.setCurrentColor(new Color(0, 0, 0, 255));
        drawTool.drawFilledRectangle(x, y+height*2/5, width, height*1/5);
        drawTool.drawFilledRectangle(x+width*2/5, y, width*1/5, height);

        drawTool.drawRectangle(x, y, width, height);

    }

    @Override
    public void update(double dt) {

        y = y+50*dt;

        if(x+width>1000){
            x = 1000-width;
        }else if(x-width < 0){
            x = 0;
        }

        if(y>1000){
            y = 0-height;
        }

    }




}
