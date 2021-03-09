package sn.isi.entities;

public class Specialite {
    private int id;
    private String nomSpe;

    public Specialite() {
    }

    public Specialite(int id, String nomSpe) {
        this.id = id;
        this.nomSpe = nomSpe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomSpe() {
        return nomSpe;
    }

    public void setNomSpe(String nomSpe) {
        this.nomSpe = nomSpe;
    }
}
