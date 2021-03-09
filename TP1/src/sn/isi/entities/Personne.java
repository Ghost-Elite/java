package sn.isi.entities;

public abstract class Personne {

    /** une class abstrait est une class qu'on peut pas instancier
     * elle peut contenir à la fois des methodes abstrait comme des methodes concrete
     * mais toute class qui est implementé par une autre class abstrait qui est herité pas une autre class
     * si cette class n'implemente pas toute les methodes abstrait cette class doit etre definie en proteger
     *
     * declaration des attributs
     */

    protected  String nom;
    protected  String prenom;

    /**
     * contructeur sans argument et avec argument
     */
    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**les getters et setters sont des methodes concretes
     * les getter et setter
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
    public abstract void saisir();
    public abstract void afficher();
}
