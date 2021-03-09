package main;

import sn.isi.entities.Moto;
import sn.isi.entities.controller.IMoto;
import sn.isi.entities.controller.MotoImpl;

public class Main {
    public static void main(String[] args) {
        IMoto moto = new MotoImpl();
        Moto m1 =moto.saisie();
        moto.afficher(m1);

    }
}
