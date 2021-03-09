package entities;

public class Salaire {
    private int id;
    private String nom;
    private String prenom;
    private double salBrut;
    private double retenue;

    public Salaire() {
    }

    public Salaire(int id, String nom, String prenom, double salBrut, double retenue) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salBrut = salBrut;
        this.retenue = retenue;
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

    public double getSalBrut() {
        return salBrut;
    }

    public void setSalBrut(double salBrut) {
        this.salBrut = salBrut;
    }

    public double getRetenue() {
        return retenue;
    }

    public void setRetenue(double retenue) {
        this.retenue = retenue;
    }
}
