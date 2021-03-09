package sn.isi.metier;

import sn.isi.entities.EtPublic;
import sn.isi.entities.PaysEt;

import java.util.Scanner;

public class EtPblicImpl implements IEtPublic{
    @Override
    public EtPublic saisie() {
        Scanner sc = new Scanner(System.in);
        PaysEt paysEt = new PaysEt();
        EtPublic etPublic = new EtPublic();

        System.out.println("Entre votre matricule");
        etPublic.setMat(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre votre nom");
        etPublic.setNom(sc.nextLine());
        System.out.println("Entre votre prenom");
        etPublic.setPrenom(sc.nextLine());
        System.out.println("Entre votre Departement");
        etPublic.setDepartement(sc.nextLine());
        System.out.println("Entre votre Faculte");
        etPublic.setFaculte(sc.nextLine());
        System.out.println("Entre votre votre bourse");
        etPublic.setBourse(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre votre pays d'origine");
        etPublic.setPaysEt(paysEt);
        paysEt.setNomPays(sc.nextLine());
        return etPublic;
    }

    @Override
    public void afficher(EtPublic etPublic) {
        System.out.println("========================INFORMATION DE L'ETUDIANT DU PUBLIC==============================");
        System.out.println("Matricule : " +etPublic.getMat());
        System.out.println("Nom : "+ etPublic.getNom());
        System.out.println("Prenom : " +etPublic.getPrenom());
        System.out.println("Departement : " +etPublic.getDepartement());
        System.out.println("Faculte : " +etPublic.getFaculte());
        System.out.println("Bourse : " +etPublic.getBourse());
        System.out.println("Pays d'origine : " +etPublic.getPaysEt().getNomPays());


    }
}
