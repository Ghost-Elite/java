package sn.isi.main;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;
import sn.isi.presentation.IRn;
import sn.isi.presentation.IZone;
import sn.isi.presentation.RnImpl;
import sn.isi.presentation.ZoneImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * instanciation de Izone , Zone et de Rn
         */
        IZone z1 = new ZoneImpl();
        Zone z =z1.saisie();
        z1.affichage(z);
        IRn r = new RnImpl();
        Rn rn =r.saisie();
        r.affichage(rn);

    }
}
