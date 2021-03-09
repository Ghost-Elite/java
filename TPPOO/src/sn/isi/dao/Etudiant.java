package sn.isi.dao;

import java.util.Scanner;

public class Etudiant {
Scanner sc = new Scanner(System.in);
    protected String nom;
    protected String prenom;
    protected String mat;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void saisir(){
        System.out.println("Entre le nom de l'etudiant");
        nom= sc.nextLine();
        System.out.printf("Entre le prenom de l'etudiant\n");
        prenom= sc.nextLine();
        System.out.println("Entre le matricule de l'etudiant");
        mat = sc.nextLine();
    }

    public void afficher() {
        System.out.println("Nom :"+nom);
        System.out.printf("Prenom :"+prenom+"\n");
        System.out.println("Matricule :"+mat);
    }

}
