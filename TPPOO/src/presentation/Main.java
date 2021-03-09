package presentation;

import sn.isi.dao.Etudiant;
import sn.isi.dao.EtudiantDB;

public class Main {
    public static void main(String[] args) {
        EtudiantDB db = new EtudiantDB();
        db.afficher();
        db.saisir();
    }
}
