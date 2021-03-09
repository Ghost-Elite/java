package sn.isi.entities;

public class Consultant extends Employe{
    public int nbheure;
    public double auxHoraire;

    public Consultant() {
    }

    public Consultant(int nbheure, double auxHoraire) {
        this.nbheure = nbheure;
        this.auxHoraire = auxHoraire;
    }

    public int getNbheure() {
        return nbheure;
    }

    public void setNbheure(int nbheure) {
        this.nbheure = nbheure;
    }

    public double getAuxHoraire() {
        return auxHoraire;
    }

    public void setAuxHoraire(double auxHoraire) {
        this.auxHoraire = auxHoraire;
    }

    @Override
    public void saisie() {

    }

    @Override
    public void afficher() {

    }
}
