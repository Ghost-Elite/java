package sn.isi.entities;

public class Personne {
    /**
     * declaration des attributs
     */
    protected int id;
    protected String password;
    protected String nom;
    protected String prenom;

    /**
     * constructeur sans argument
     */
    public Personne() {
    }

    /**
     * consgtructeur avec argument
     * @param id
     * @param password
     * @param nom
     * @param prenom
     */
    public Personne(int id, String password, String nom, String prenom) {
        this.id = id;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * les getteurs et setteurs
     * @return
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
