package sn.isi.entities;

import java.util.Date;

public class Tansfert {
    private int id;
    private String libelle;
    private double MOntant;
    private Date date;

    public Tansfert() {
    }

    public Tansfert(int id, String libelle, double MOntant, Date date) {
        this.id = id;
        this.libelle = libelle;
        this.MOntant = MOntant;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getMOntant() {
        return MOntant;
    }

    public void setMOntant(double MOntant) {
        this.MOntant = MOntant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
