package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.util.ArrayList;

public class Clouds extends GraphicalObject{

    private ArrayList<Cloud> allClouds ;
    private Sun sun;

    public Clouds(Sun sun){

        allClouds = new ArrayList<Cloud>();
        this.sun = sun;

        for(int i = 0; i < 0; i++){
            this.newCloud((int) (Math.random()*1000), (int) (Math.random()*700));
        }

    }

    @Override
    public  void draw(DrawTool drawTool){

        for( Cloud cloud: allClouds )
        {
            cloud.draw(drawTool);
        }

    }

    @Override
    public void update(double dt) {

        for( Cloud cloud: allClouds ) {
            cloud.update(dt);
        }

        for (int i = 0; i < allClouds.size(); i++) {
            if(allClouds.get(i).checkPos()){
                this.deleteCloud(allClouds, allClouds.get(i));
            }
        }

    }

    public void newCloud(int x, int y){

        Cloud cloud = new Cloud(x, y, (int) (Math.random()*150)+100 , sun);
        allClouds.add(cloud);

    }


    public void deleteCloud(ArrayList<Cloud> allClouds, Cloud cloud) {
        allClouds.remove(cloud);
    }

}
