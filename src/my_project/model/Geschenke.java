package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.util.ArrayList;

public class Geschenke extends GraphicalObject{

    private ArrayList<Geschenk> allPresents ;


    public Geschenke(){

        allPresents = new ArrayList<Geschenk>();

        for(int i = 0; i < 5; i++){
            this.newPresent((int) (Math.random()*1000), 0);
        }

    }

    @Override
    public  void draw(DrawTool drawTool){

        for( Geschenk geschenk: allPresents )
        {
            geschenk.draw(drawTool);
        }

    }

    @Override
    public void update(double dt) {

        for( Geschenk geschenk: allPresents ) {
            geschenk.update(dt);
        }



    }

    public void newPresent(int x, int y){

        Geschenk present = new Geschenk(x, y, 50, 50);
        allPresents.add(present);

    }
    public ArrayList<Geschenk> getList(){

        return allPresents;

    }

    public void deletePresent(ArrayList<Geschenk> allPresents, Geschenk present) {
        allPresents.remove(present);
    }

}
