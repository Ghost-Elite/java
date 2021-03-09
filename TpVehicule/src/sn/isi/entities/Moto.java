package sn.isi.entities;

public class Moto extends Vehicule{

    private int vitesse;
    private String equipement;

    public Moto() {
    }

    public Moto(String nom, String modele, int vitesse, String equipement) {
        super(nom, modele);
        this.vitesse = vitesse;
        this.equipement = equipement;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getEquipement() {
        return equipement;
    }

    public void setEquipement(String equipement) {
        this.equipement = equipement;
    }

    @Override
    public void changeVitesse(int a) {

    }

    @Override
    public void speed(int b) {
        vitesse = vitesse+b;
    }

    @Override
    public void frener(int c) {
        vitesse = vitesse -c;
    }
}
