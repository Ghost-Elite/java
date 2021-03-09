package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class Rn {
    /**
     * les attributs
     */
    private int id;
    private double latitude;
    private double longitude;
    private List<Zone> zones = new ArrayList<Zone>();

    /**
     * constructeur sans arguement
     */
    public Rn() {
    }

    /**
     * constructeur avec argument
     * @param id
     * @param latitude
     * @param longitude
     * @param zones
     */
    public Rn(int id, double latitude, double longitude, List<Zone> zones) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zones = zones;
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

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }
}
