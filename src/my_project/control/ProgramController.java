package my_project.control;

import KAGO_framework.control.ViewController;

import java.awt.event.MouseEvent;

import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    public Geschenke aGeschenke;
    public Clouds aClouds;
    public Flocken aFlocken;
    public GameManager aGameManager;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param ViewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController ViewController){

        this.viewController = ViewController;


    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen. Achtung: funktioniert nicht im Szenario-Modus
     */
    public void startProgram() {
        Background aBackground = new Background(0, 0, 1000, 1029);
        viewController.draw(aBackground);

        Sun aSun = new Sun(0, 100, 50, 50);
        viewController.draw(aSun);

        House aHouse = new House(100, 1000-200, 200, 200);
        viewController.draw(aHouse);
        House bHouse = new House(450, 1000-200, 200, 200);
        viewController.draw(bHouse);
        House cHouse = new House(700, 1000-200, 200, 200);
        viewController.draw(cHouse);

        Tree aTree = new Tree(300, 1000-170,  100, 170, 50);
        viewController.draw(aTree);

        Fence aFence = new Fence(300, 1000-50,  100, 50);
        viewController.draw(aFence);

        Rentier aRentier = new Rentier(100, 200);
        viewController.draw(aRentier);
        Rentier bRentier = new Rentier(300, 500);
        viewController.draw(bRentier);

        aFlocken = new Flocken();
        viewController.draw(aFlocken);

        aGeschenke = new Geschenke();
        viewController.draw(aGeschenke);

        aClouds = new Clouds(aSun);
        viewController.draw(aClouds);

        LightSetter aLightSetter = new LightSetter(0, 0, 1000, 1029, aSun);
        viewController.draw(aLightSetter);

        Sterne aSterne = new Sterne(aSun);
        viewController.draw(aSterne);

        Mond aMond = new Mond(-1000, 100, 75/2, 50);
        viewController.draw(aMond);

        aGameManager = new GameManager(aGeschenke);


    }

    /**
     * Für FORTGESCHRITTENE
     * Diese Methode wird wiederholt automatisch aufgerufen und zwar für jede Frame einmal, d.h. über 25 mal pro Sekunde.
     * @param dt Die Zeit in Sekunden, die seit dem letzten Aufruf der Methode vergangen ist.
     */
    public void updateProgram(double dt){

        aGameManager.checkPos();

    }

    /**
     * Für FORTGESCHRITTENE
     * Diese Methode wird einmalig aufgerufen für jedes Mal, wenn die Maus im Fenster geklickt wird.
     * @param e Das übergebene Objekt enthält alle Informationen zum MouseEvent
     */
    public void mouseClicked(MouseEvent e){
        if(e.getButton() == 1) {
            aGameManager.checkCollision(e.getX(), e.getY());
        }else if(e.getButton() == 3){
            aClouds.newCloud(e.getX(), e.getY());
        }

    }

}
