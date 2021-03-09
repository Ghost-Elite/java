package entities;

import java.util.List;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    List<Matiere> matieres;

    public Professeur() {
        super();
    }

    public Professeur(int id, String nom, String prenom, List<Matiere> matieres) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matieres = matieres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
}
