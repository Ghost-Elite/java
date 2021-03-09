package sn.isi.entities;

public abstract class Vehicule {
    protected String nom;
    protected String modele;

    public Vehicule() {
    }

    public Vehicule(String nom, String modele) {
        this.nom = nom;
        this.modele = modele;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
    public abstract void changeVitesse(int a);
    public abstract void speed(int b);
    public abstract void frener(int c);
}
