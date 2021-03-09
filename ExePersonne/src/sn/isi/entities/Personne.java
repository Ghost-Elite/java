package sn.isi.entities;

public abstract class Personne {
    /**
     * declaration des attributs
     */
    protected String nom;
    protected String prenom;

    /**
     * constructeur sans argument
     */
    public Personne() {

    }

    /**
     * constructeur avec argument
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getters and setters
     */
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

    /**
     * methodes abstrait
     */
    public abstract void afficher();

    public abstract void saisie();
}
