package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class MedecinSpecialiste extends Medecin{
    /**
     * declaration des attributs
     */
    private String specialite;

    /**
     * constructeur sans argument
     */
    public MedecinSpecialiste() {
    }

    /**
     * constructeur avec argument
     * @param id
     * @param password
     * @param nom
     * @param prenom
     * @param service
     * @param specialite
     */
    public MedecinSpecialiste(int id, String password, String nom, String prenom, Service service, String specialite) {
        super(id, password, nom, prenom, service);
        this.specialite = specialite;
    }

    /**
     * liste des specialites du medecin
     */
    public void affichageSpecialite(){
        ArrayList list = new ArrayList();
        list.add("urologue");
        list.add("pneumologue");
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
