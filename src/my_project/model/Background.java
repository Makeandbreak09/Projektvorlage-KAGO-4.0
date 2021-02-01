package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject{

    public Background(int pX, int pY, int pWidth, int pHeight){

        x = pX;
        y = pY;
        width = pWidth;
        height = pHeight;


    }

    @Override
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0, 0, 255 , 255));
        drawTool.drawFilledRectangle(x, y, width, height);

    }

    @Override
    public void update(double dt){



    }


}
