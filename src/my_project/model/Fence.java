package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Fence extends GraphicalObject{

    public Fence(int pX, int pY, int pWidth, int pHeight){

        x = pX;
        y = pY;
        width = pWidth;
        height = pHeight;

    }

    @Override
    public  void draw(DrawTool drawTool){

        drawTool.setCurrentColor(150, 150, 150, 255);
        drawTool.drawFilledRectangle(x, y, width*7/5, height/5);
        drawTool.drawFilledRectangle(x, y+height*2/5, width*7/5, height/5);
        drawTool.drawFilledRectangle(x+width*1/5, y-height/5, width/5, height*5/5);
        drawTool.drawFilledRectangle(x+width*3/5, y-height/5, width/5, height*5/5);
        drawTool.drawFilledRectangle(x+width*5/5, y-height/5, width/5, height*5/5);
        drawTool.drawFilledTriangle(x+width*1/5, y-height/5, x+width*1/5+width/5, y-height/5, x+width*1/5+width/5/2, y-height*2/5);
        drawTool.drawFilledTriangle(x+width*3/5, y-height/5, x+width*3/5+width/5, y-height/5, x+width*3/5+width/5/2, y-height*2/5);
        drawTool.drawFilledTriangle(x+width*5/5, y-height/5, x+width*5/5+width/5, y-height/5, x+width*5/5+width/5/2, y-height*2/5);
    }

    @Override
    public void update(double dt) {

    }
}
