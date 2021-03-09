package main;

import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinGeneraliste;
import sn.isi.entities.MedecinSpecialiste;
import sn.isi.service.traitement.IMedecin;
import sn.isi.service.traitement.MedecinImpl;

public class Main {
    public static void main(String[] args) {
        /**
         * instanciation de la class Medecin et affichage des cases
         */
        Medecin medecin = new Medecin();
        medecin.displayMenu(1);
        medecin.displayMenu(2);
        medecin.displayMenu(3);


    }
}
