package entities;

import java.util.Date;

public class Transfert {
    //les attributs
    private int id;
    private String liblle;
    private double montant;
    private Date date = null;

    //les constructeurs


    public Transfert() {
    }

    public Transfert(int id, String liblle, double montant, Date date) {
        this.id = id;
        this.liblle = liblle;
        this.montant = montant;
        this.date = date;
    }
    //les getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLiblle() {
        return liblle;
    }

    public void setLiblle(String liblle) {
        this.liblle = liblle;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
