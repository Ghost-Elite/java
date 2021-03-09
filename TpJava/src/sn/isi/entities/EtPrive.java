package sn.isi.entities;

import sn.isi.metier.EtPriveImpl;
import sn.isi.metier.IEtPrive;

public class EtPrive extends Etudiant{
    private String filiere;
    private String niveau;
    private double mensualite;

    public EtPrive() {
        super();
    }

    public EtPrive(int id, int mat, String nom, String prenom, double inscription, PaysEt paysEt, String filiere, String niveau, double mensualite) {
        super(id, mat, nom, prenom, inscription, paysEt);
        this.filiere = filiere;
        this.niveau = niveau;
        this.mensualite = mensualite;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public double getMensualite() {
        return mensualite;
    }

    public void setMensualite(double mensualite) {
        this.mensualite = mensualite;
    }


}
