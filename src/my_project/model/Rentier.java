package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Rentier extends GraphicalObject {

    private boolean nachOben;
    private double timer;


    public Rentier(int pX, int pY){

        x = pX;
        y = pY;
        nachOben = true;
        timer = 3.0;



    }

    @Override
    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(188, 143, 143, 255);
        drawTool.drawFilledRectangle(x, y, 75, 35);
        drawTool.drawFilledRectangle(x+5, y+35, 10, 20);
        drawTool.drawFilledRectangle(x+60, y+35, 10, 20);
        drawTool.drawFilledRectangle(x+65, y-25, 10, 25);
        drawTool.drawFilledRectangle(x+75, y-20, 15, 10);

    }

    @Override
    public void update(double dt) {

        timer = timer-dt;
        if(timer<0.0){
            timer = 3.0;
            nachOben =! nachOben;
        }

        bewegeAufXAchse(dt);
        bewegeAufYAchse(dt);

    }

    private void bewegeAufXAchse(double dt){
        x = x+100*dt;

        if(x > 1100){
            x = -200;
        }

    }

    private void bewegeAufYAchse(double dt){
        if(nachOben){
            y = y-25*dt;
        }else{
            y = y+25*dt;
        }
    }

}
