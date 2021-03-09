package sn.isi.presentation;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImpl implements IRn {
    /**
     * instanciation de la liste de zone
     */
    List<Zone> zones = new ArrayList<Zone>();

    /**
     * implementation de l'interface IRn
     * @return
     */
    @Override
    public Rn saisie() {
        Scanner sc = new Scanner(System.in);
        Rn rn = new Rn();
        String rep = null;


        System.out.println("Entre l'id");
        rn.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre la latitude");
        rn.setLatitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre la longitude");
        rn.setLongitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre la liste de la zone");
        /**
         * boucle do while permettant de controller la saisie si l'utilisateur veut continuer la saisie
         */
        do {
            Zone zone1 = new Zone();
            IZone zone = new ZoneImpl();
            rn.getZones().add(new ZoneImpl().saisie());
            System.out.println("Continuer O/N");
            rep = sc.nextLine();
        } while (rep.equalsIgnoreCase("o"));


        return rn;
    }

    /**
     * affichage des zone et de la liste des rn
     * @param rn
     */
    @Override
    public void affichage(Rn rn) {

        zones = rn.getZones();
        System.out.println("ID : " + rn.getId());
        System.out.println("Latitude : " + rn.getLatitude());
        System.out.println("Longitude : " + rn.getLongitude());
        for (Zone r1 : rn.getZones()) {
            new ZoneImpl().affichage(r1);
        }
    }
}
