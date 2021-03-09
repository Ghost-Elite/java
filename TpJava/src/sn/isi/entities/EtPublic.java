package sn.isi.entities;

public class EtPublic extends Etudiant{
    private String faculte;
    private String departement;
    private double bourse;

    public EtPublic() {
        super();
    }

    public EtPublic(int id, int mat, String nom, String prenom, double inscription, PaysEt paysEt, String faculte, String departement, double bourse) {
        super(id, mat, nom, prenom, inscription, paysEt);
        this.faculte = faculte;
        this.departement = departement;
        this.bourse = bourse;
    }

    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getBourse() {
        return bourse;
    }

    public void setBourse(double bourse) {
        this.bourse = bourse;
    }
}
