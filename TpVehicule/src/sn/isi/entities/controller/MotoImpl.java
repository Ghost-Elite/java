package sn.isi.entities.controller;

import sn.isi.entities.Moto;

import java.util.Scanner;

public class MotoImpl implements IMoto{
    @Override
    public Moto saisie() {
        Scanner sc = new Scanner(System.in);
        Moto moto = new Moto();
        System.out.println("Entre le model");
        moto.setModele(sc.nextLine());
        System.out.println("Entre le nom du bicyclete");
        moto.setNom(sc.nextLine());
        System.out.println("Entre la vitesse");
        moto.setVitesse(Integer.parseInt(sc.nextLine()));
        return moto;
    }

    @Override
    public void afficher(Moto moto) {
        System.out.println("Model : " +moto.getModele());
        System.out.println("Nom : " +moto.getNom());
        System.out.println("Vitesse : " +moto.getVitesse());
    }
}
