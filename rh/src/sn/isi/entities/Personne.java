package sn.isi.entities;

public abstract class Personne {

    /**
     * declaration des attributs
     */

    protected int id;
    protected String password;
    protected String nom;
    protected String email;
    protected String prenom;
    protected int etat;

    /**
     * constructeur avec argument
     */

    public Personne() {
    }

    /**
     * constructeur avec argument
     */

    public Personne(int id, String password, String nom, String email, String prenom, int etat) {
        this.id = id;
        this.password = password;
        this.nom = nom;
        this.email = email;
        this.prenom = prenom;
        this.etat = etat;
    }

    /**
     * les getteurs et les setteurs
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    public abstract void saisie();
    public abstract void afficher();
}
