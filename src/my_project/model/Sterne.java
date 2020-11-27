package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.util.ArrayList;

public class Sterne extends GraphicalObject{

    private int amount;
    private ArrayList<Stern> allStars;


    public Sterne(Sun sun){

        this.allStars = new ArrayList<Stern>();


        amount = (int) (Math.random()*30) +20;


        for(int i=0; i<amount; i += 1){

            Stern star = new Stern((int) (Math.random()*1000), (int) (Math.random()*600), sun);
            allStars.add(star);

        }

    }

    @Override
    public void draw(DrawTool drawTool){

        for( Stern star: allStars )
        {
            star.draw(drawTool);
        }

    }

    @Override
    public void update(double dt) {



    }
}
