package presentation;

import controller.ITransfert;
import controller.TransfertImpl;
import sn.isi.entities.Tansfert;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tansfert tansfert = new Tansfert();
        TransfertImpl t = new TransfertImpl();
        Tansfert t1 = t.saisie();
        t.affichage(t1);




    }
}
