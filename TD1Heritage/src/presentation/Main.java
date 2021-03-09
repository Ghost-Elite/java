package presentation;

import sn.isi.entities.Etudiant;
import sn.isi.entities.Personne;
import sn.isi.entities.Professeur;

public class Main {
    public static void main(String[] args) {
        /**
         * instanciation
         *
         */

        Etudiant E = new Etudiant();
        ((Etudiant)E).saisir();
        ((Etudiant)E).afficher();
        Professeur P = new Professeur();
        ((Professeur)P).saisir();
        ((Professeur)P).afficher();

    }
}
