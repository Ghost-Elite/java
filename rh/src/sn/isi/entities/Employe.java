package sn.isi.entities;

public class Employe extends Personne{
    protected String service;

    public Employe() {
    }

    public Employe(int id, String password, String nom, String email, String prenom, int etat, String service) {
        super(id, password, nom, email, prenom, etat);
        this.service = service;
    }


    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public void saisie() {

    }

    @Override
    public void afficher() {

    }
}
