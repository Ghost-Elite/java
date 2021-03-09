package sn.isi.entities;

public class User {

    /**
     * les attributs
     * id int, nom String,  prenom String,  email String,  password String,  etat int
     */

    private int idU;

    private String password;
    private String nom;
    private String email;
    private String prenom;
    public int etat;

    /**
     * constructeur sans argument
     */

    public User() {
    }

    /**
     * constructeur avec argument
     * @param idU
     *
     * @param password
     * @param nom
     * @param email
     * @param prenom
     * @param etat
     */


    public User(int idU, String password, String nom, String email, String prenom, int etat) {
        this.idU = idU;
        this.password = password;
        this.nom = nom;
        this.email = email;
        this.prenom = prenom;
        this.etat = etat;
    }

    /**
     * getteur et setteur
     * @return
     */

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
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
}
