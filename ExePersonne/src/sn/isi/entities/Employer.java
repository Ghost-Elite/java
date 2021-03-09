package sn.isi.entities;

public abstract class Employer extends Personne {
    protected String departement;

    public Employer() {
        super();
    }

    public Employer(String nom, String prenom, String departement) {
        super(nom, prenom);
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }


    public abstract void saisie();

    public abstract void afficher();

    public abstract void salaire();
}
