package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

/**
 * Ein Objekt dieser Klasse stellt ein simples Haus dar.
 */
public class House extends GraphicalObject {

    /**
     * Konstruktor der Klasse House, die von der Klasse GraphicalObject erbt.
     * Das Prinzip der Vererbung wird in naher Zukunft im Unterricht noch besprochen.
     * Hier im Beispiel werden Werte den in der Oberklasse GraphicalObject deklarierten und dort bereits initialisierten Attributen zugewiesen.
     */
    public House(int pX, int pY, int pWidth, int pHeight){
        x = pX;
        y = pY;
        width = pWidth;
        height = pHeight;
    }


    @Override
    /**
     * Wird vom Hintergrundprozess für jeden Frame aufgerufen. Nur hier kann die grafische Repräsentation des Objekts realisiert
     * werden. Es ist möglich über das Grafikobjekt "drawTool" ein Bild zeichnen zu lassen, aber auch geometrische Formen sind machbar.
     */
    public void draw(DrawTool drawTool) {
        //Zeichnet die Häuser
        drawTool.setCurrentColor(100, 100, 100, 255);
        drawTool.drawFilledRectangle(x+width/5, y-height/3, height/10, width/3);

        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledTriangle(x,y,x+width,y,x+width/2,y-height/3);
        drawTool.setCurrentColor(255,0,0,255);
        drawTool.drawFilledRectangle(x,y,width,height);

        //Zeichnet die Tür
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledRectangle(x+width/2, y+height-height*2/5, width*1.5/5, height*2/5);
        drawTool.setCurrentColor(255, 255,0 , 255);
        drawTool.drawFilledCircle(x+width/2+(width/3/3), y+height-(height/3/2), (width+height)/2/20);

        //Zeichnet die Fenster
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledRectangle(x+width/5, y+height*1/5, width/5, height/5);
        drawTool.drawFilledRectangle(x+width*3/5, y+height*1/5, width/5, height/5);

        drawTool.setCurrentColor(100, 100, 100, 255);
        drawTool.drawLine(x+width/5+width/5/2, y+height*1/5, x+width/5+width/5/2, y+height*1/5+height/5);
        drawTool.drawLine(x+width/5, y+height*1/5+height/5/2, x+width*2/5, y+height*1/5+height/5/2);

        drawTool.drawLine(x+width*3/5+width/5/2, y+height*1/5, x+width*3/5+width/5/2, y+height*1/5+height/5);
        drawTool.drawLine(x+width*3/5, y+height*1/5+height/5/2, x+width*4/5, y+height*1/5+height/5/2);

        drawTool.drawRectangle(x+width/5, y+height*1/5, width/5, height/5);

        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawTriangle(x,y,x+width,y,x+width/2,y-height/3);
    }


    @Override
    /**
     * Wird vom Hintergrundprozess für jeden Frame aufgerufen. Hier kann das verhalten des Objekts festgelegt werden, zum Beispiel
     * seine Bewegung.
     */
    public void update(double dt) {

    }
}
