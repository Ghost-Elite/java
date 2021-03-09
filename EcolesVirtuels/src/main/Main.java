package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.traitement.EcoleImpl;
import sn.isi.traitement.IEcole;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
       IEcole ecole = new EcoleImpl();
        Map<Specialite,Ecole> listEcole = ecole.saisie();
        ecole.affichageEcoles(listEcole);

    }
}
