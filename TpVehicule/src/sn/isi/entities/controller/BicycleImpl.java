package sn.isi.entities.controller;

import sn.isi.entities.Bicycle;
import sn.isi.entities.Vehicule;

import java.util.Scanner;

public class BicycleImpl implements IBicycle{
    @Override
    public Bicycle saisie() {
        Scanner sc = new Scanner(System.in);
        Bicycle b1 = new Bicycle();
        System.out.println("Entre le model");
        b1.setModele(sc.nextLine());
        System.out.println("Entre le nom du bicyclete");
        b1.setNom(sc.nextLine());
        System.out.println("Entre la vitesse");
        b1.setVitesse(Integer.parseInt(sc.nextLine()));

        return b1;
    }

    @Override
    public void afficher(Bicycle bicycle) {
        System.out.println("Model : "+bicycle.getModele());
        System.out.println("Nom : " +bicycle.getNom());
        System.out.println("Vitesse : " +bicycle.getVitesse());
    }
}
