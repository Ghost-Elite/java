package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste extends Medecin{
    private String specialiste;

    /**
     * constructeur avec argument
     */
    public MedecinGeneraliste() {
    }

    /**
     * contructeur avec argument
     * @param id
     * @param password
     * @param nom
     * @param prenom
     * @param service
     * @param specialiste
     */
    public MedecinGeneraliste(int id, String password, String nom, String prenom, Service service, String specialiste) {
        super(id, password, nom, prenom, service);
        this.specialiste = specialiste;
    }

    /**
     * les gettteurs et setteurs
     * @return
     */
    public String getSpecialiste() {
        return specialiste;
    }

    public void setSpecialiste(String specialiste) {
        this.specialiste = specialiste;
    }

    public void afficherListe(){
        ArrayList list = new ArrayList();
        list.add("anesthésien");
        list.add("dermatologue");
        list.add("endocrinologue");
        list.add("gynécologue");
        for (Object elm :list){
            System.out.println(elm);
        }
    }
    /**
     * methode qui permet d'afficher le nom de la class :)
     */
    public void med(){
        System.out.println("===================INFORMATION "+getClass().getSimpleName()+"=======================");
    }


}
