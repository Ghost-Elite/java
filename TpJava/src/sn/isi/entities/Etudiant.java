package sn.isi.entities;

import sn.isi.metier.EtPblicImpl;
import sn.isi.metier.EtPriveImpl;
import sn.isi.metier.IEtPrive;
import sn.isi.metier.IEtPublic;

import java.util.Scanner;

public class Etudiant {
    /**
     * # proteger
     * + public
     * - privée
     */
    protected int id;
    protected int mat;
    protected String nom;
    protected String prenom;
    protected double inscription;
    protected PaysEt paysEt;

    public Etudiant() {
    }

    public Etudiant(int id,int mat, String nom, String prenom, double inscription, PaysEt paysEt) {
        this.id = id;
        this.mat = mat;
        this.nom = nom;
        this.prenom = prenom;
        this.inscription = inscription;
        this.paysEt = paysEt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
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

    public double getInscription() {
        return inscription;
    }

    public void setInscription(double inscription) {
        this.inscription = inscription;
    }

    public PaysEt getPaysEt() {
        return paysEt;
    }

    public void setPaysEt(PaysEt paysEt) {
        this.paysEt = paysEt;
    }

    public void displayMenu(int nbMenu){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================Entre votre choix==========================");
        System.out.println("                     1 : Etudiant du Privé                      ");
        System.out.println("                     2 : Etudiant du Public                     ");
        System.out.println("=====================*******************=========================");
        nbMenu = Integer.parseInt(sc.nextLine());
        switch (nbMenu){
            case 1 :
                IEtPrive ip = new EtPriveImpl();
                EtPrive etPrive=ip.saisi();
                ip.afficher(etPrive);
                break;
            case 2 :
                IEtPublic et = new EtPblicImpl();
                EtPublic etPublic1 = et.saisie();
                et.afficher(etPublic1);
                break;
            default:
                System.out.println("choix erroné :(!!!");
        }
    }

}
