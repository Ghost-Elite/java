package sn.isi.entities;

import java.util.List;

public class Zone {
    /**
     * declaration des attributs
     */
    private int id;
    private String nom;
    private double latitude;
    private double longitude;

    /**
     * constructeur sans argument
     */
    public Zone() {
    }

    /**
     * constructeur avec ar argument
     * @param id
     * @param nom
     * @param latitude
     * @param longitude
     */
    public Zone(int id, String nom, double latitude, double longitude) {
        this.id = id;
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * les getters et setteurs
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
