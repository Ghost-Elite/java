package sn.isi.entities;

import java.util.Scanner;

public class Journalier extends Employer {
    private int nbHeur;
    private double taux;

    public Journalier() {
        super();
    }

    public Journalier(String nom, String prenom, String departement, int nbHeur, double taux) {
        super(nom, prenom, departement);
        this.nbHeur = nbHeur;
        this.taux = taux;
    }

    @Override
    public void saisie() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre votre nom");
        nom = sc.nextLine();
        System.out.printf("Entre votre prenom");
        prenom = sc.nextLine();
        System.out.println("Entre le nombre d'heure");
        nbHeur = Integer.parseInt(sc.nextLine());
        System.out.printf("Entre le taux");
        taux = Double.parseDouble(sc.nextLine());


    }

    @Override
    public void afficher() {
        System.out.printf("Nom :" + nom);
        System.out.printf("Prenom :" + prenom);
        System.out.printf("Votre departement :" + departement);
        System.out.printf("Nombre d'heur :" + nbHeur);
        System.out.printf("Taux :" + taux);

    }

    @Override
    public void salaire() {
        double salaire = nbHeur * taux;
        System.out.printf("Ton salaire est :" + salaire);
    }
}
