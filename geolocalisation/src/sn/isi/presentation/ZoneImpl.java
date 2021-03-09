package sn.isi.presentation;

import sn.isi.entities.Zone;

import java.util.Scanner;

public class ZoneImpl implements IZone{
    /**
     * implementation de l'interface IZone
     * @return
     */
    @Override
    public Zone saisie() {
        Scanner sc = new Scanner(System.in);
        Zone z = new Zone();
        System.out.println("Entre l'id");
        z.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre le nom de la zone");
        z.setNom(sc.nextLine());
        System.out.println("Entre la latitude");
        z.setLatitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre la longitude");
        z.setLongitude(Double.parseDouble(sc.nextLine()));
        return z;
    }

    @Override
    public void affichage(Zone zone) {
        System.out.println("ID : " +zone.getId());
        System.out.println("Nom : " +zone.getNom());
        System.out.println("Latitude : " +zone.getLatitude());
        System.out.println("Longitude : " +zone.getLongitude());
    }
}
