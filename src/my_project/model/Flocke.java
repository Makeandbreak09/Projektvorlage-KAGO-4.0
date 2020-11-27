package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;


public class Flocke extends GraphicalObject{

    private int speedY;

    public Flocke(int x, int y){

        this.x = x;
        this.y = y;
        speedY = (int)(Math.random()*20+10);


    }

    @Override
    public  void draw(DrawTool drawTool){

        drawTool.setCurrentColor(255, 255 ,255 ,230);
        drawTool.drawFilledCircle(x, y, 5);

    }

    @Override
    public void update(double dt) {

        y = y+speedY*dt;

        if(x+width>1000){
            x = 1000-width;
        }else if(x-width < 0){
            x = 0;
        }



    }
    public boolean checkPos(){
        if(y>=1000){
            return true;
        }
        return false;
    }


}
