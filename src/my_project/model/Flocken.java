package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.util.ArrayList;

public class Flocken extends GraphicalObject{

    private ArrayList<Flocke> allSnow ;


    public Flocken(){

        allSnow = new ArrayList<Flocke>();

        for(int i = 0; i < 1500; i++){
            this.newSnow((int) (Math.random()*1000), (int) (Math.random()*1000));
        }

    }

    @Override
    public  void draw(DrawTool drawTool){

        for( Flocke snow: allSnow )
        {
            snow.draw(drawTool);
        }

    }

    @Override
    public void update(double dt) {

        for( Flocke snow: allSnow ) {
            snow.update(dt);
        }

        for (int i = 0; i < allSnow.size(); i++) {
            if(allSnow.get(i).checkPos()){
                this.deleteSnow(allSnow, allSnow.get(i));
                this.newSnow((int)(Math.random()*1000), 0);
            }
        }



    }

    public void newSnow(int x, int y){

        Flocke snow = new Flocke(x, y);
        allSnow.add(snow);

    }

    public void deleteSnow(ArrayList<Flocke> allSnow, Flocke snow) {
        allSnow.remove(snow);
    }

}
