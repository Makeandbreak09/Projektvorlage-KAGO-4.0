package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Tree extends GraphicalObject {

    private int r;

    public Tree(int pX, int pY, int pWidth, int pHeight, int pR){

        x = pX;
        y = pY;
        width = pWidth;
        height = pHeight;
        r = pR;

    }

    @Override
    public void draw(DrawTool drawTool){
        //Zeichne Baum
        drawTool.setCurrentColor(112, 54, 9, 255);
        drawTool.drawFilledRectangle(x+width*1/3, y+r/2 , width/3, height);
        drawTool.setCurrentColor(64, 117, 30, 255);
        drawTool.drawFilledCircle(x, y, r);


    }

    @Override
    public void update(double dt) {

    }
}
