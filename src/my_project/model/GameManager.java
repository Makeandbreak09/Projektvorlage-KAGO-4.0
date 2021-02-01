package my_project.model;

import java.util.ArrayList;

public class GameManager {

    private int scene;
    private ArrayList<Geschenk> allPresents;
    private Geschenke aGeschenke;

    public  GameManager(Geschenke aGeschenke){
        this.allPresents = aGeschenke.getList();
        this.aGeschenke = aGeschenke;
    }

    public void checkCollision(int x, int y){
        for(int i = 0; i < allPresents.size(); i++){
            Geschenk present = allPresents.get(i);
            if (x >= present.getX() && x <= present.getX()+present.getWidth() && y >= present.getY() && y <= present.getY()+present.getHeight()){
                allPresents.remove(allPresents.get(i));
                aGeschenke.newPresent((int) (Math.random()*1000), 0);
            }
        }
    }

    public void checkPos(){
        for(int i = 0; i < allPresents.size(); i++){
            if(allPresents.get(i).getY()>1000){
                allPresents.remove(i);
            }
        }
    }


}
