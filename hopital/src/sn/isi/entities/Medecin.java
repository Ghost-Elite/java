package sn.isi.entities;

import sn.isi.service.traitement.IMedecin;
import sn.isi.service.traitement.MedecinImpl;

import java.util.Scanner;

public class Medecin extends Personne{
    /**
     * declaration des attributs
     */
    private Service service;

    /**
     * consructeur sans argument
     */
    public Medecin() {
    }

    /**
     * Constructeur avec argument
     * @param id
     * @param password
     * @param nom
     * @param prenom
     * @param service
     */
    public Medecin(int id, String password, String nom, String prenom, Service service) {
        super(id, password, nom, prenom);
        this.service = service;
    }

    /**
     * les getteurs et setteurs
     * @return
     */

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    /**
     * creation du menu et instanciation des methodes de medecin implementation
     * @param nbMenu
     */
    public void displayMenu(int nbMenu){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================Entre votre choix===========================");
        System.out.println("                     1 : Medecin Specialiste                     ");
        System.out.println("                     2 : Medecin Generaliste                     ");
        System.out.println("                     3 : Medecin Chef                            ");
        System.out.println("=====================*******************=========================");
        /**
         * nbMenu permet de recuperer le choix de l'utilisateur
         */
        nbMenu = Integer.parseInt(sc.nextLine());
        switch (nbMenu){
            case 1 :
                /**
                 * instanciation de la class medecin specialiste et la class medecin Implementation
                 */
                MedecinSpecialiste medecinSpecialiste = new MedecinSpecialiste();
                medecinSpecialiste.med();
                IMedecin medecin1 = new MedecinImpl();
                Medecin m1 =medecin1.saisie();
                medecin1.afficher(m1);
                medecinSpecialiste.affichageSpecialite();
                break;
            case 2 :
                /**
                 * instanciation de la class medecin generaliste et la class medecin Implementation
                 */
                MedecinGeneraliste g = new MedecinGeneraliste();
                g.med();
                IMedecin medecin2 = new MedecinImpl();
                Medecin m2 = medecin2.saisie();
                medecin2.afficher(m2);
                g.afficherListe();
                break;
            case 3 :
                /**
                 * instanciation de la class medecin chef et la class medecin Implementation
                 */
                Scanner t = new Scanner(System.in);
                MedecinChef chef = new MedecinChef();
                chef.med();
                IMedecin medecin3 = new MedecinImpl();
                Medecin m3 =medecin3.saisie();
                medecin3.afficher(m3);
                chef.setBureau("BA21");
                System.out.println("Bureau : " +chef.getBureau());
                break;
            default:
                System.out.println("choix erroné :(!!!");
        }
    }
}
