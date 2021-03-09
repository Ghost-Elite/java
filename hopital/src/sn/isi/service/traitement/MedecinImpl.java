package sn.isi.service.traitement;

import sn.isi.entities.Medecin;
import sn.isi.entities.Service;

import java.util.Scanner;

public class MedecinImpl implements IMedecin{
    /**
     * methode saisie d'un medecin
     * @return
     */
    @Override
    public Medecin saisie() {
        Scanner sc = new Scanner(System.in);
        Medecin medecin = new Medecin();
        Service service = new Service();
        System.out.println("Entre le nom du medecin");
        medecin.setNom(sc.nextLine());
        System.out.println("Entre le prenom du medecin");
        medecin.setPrenom(sc.nextLine());
        System.out.println("Entre le password du medecin");
        medecin.setPassword(sc.nextLine());
        System.out.println("Entre le nom de service du medecin");
        medecin.setService(service);
        service.setNomService(sc.nextLine());
        return medecin;
    }

    /**
     * affichage d'un medecin
     * @param medecin
     */
    @Override
    public void afficher(Medecin medecin) {

        System.out.println("Nom : " +medecin.getNom());
        System.out.println("Prenom : " +medecin.getPrenom());
        System.out.println("Password : " +medecin.getPassword());
        System.out.println("Nom de service : " +medecin.getService().getNomService());
    }

}
