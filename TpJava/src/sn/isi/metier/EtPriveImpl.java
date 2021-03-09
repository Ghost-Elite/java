package sn.isi.metier;

import sn.isi.entities.EtPrive;
import sn.isi.entities.PaysEt;

import java.util.Scanner;

public class EtPriveImpl implements IEtPrive{
    @Override
    public EtPrive saisi() {
        Scanner sc = new Scanner(System.in);
        EtPrive etPrive = new EtPrive();
        PaysEt paysEt = new PaysEt();
        System.out.println("Entre votre matricule");
        etPrive.setMat(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre votre nom");
        etPrive.setNom(sc.nextLine());
        System.out.println("Entre votre prenom");
        etPrive.setPrenom(sc.nextLine());
        System.out.println("Entre le montant de l'inscription de l'Etudiant");
        etPrive.setInscription(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre la mensualite de l'Etudiant");
        etPrive.setMensualite(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre votre filiere");
        etPrive.setFiliere(sc.nextLine());
        System.out.println("Entre votre niveau");
        etPrive.setNiveau(sc.nextLine());
        System.out.println("Entre votre pays d'origine");
        etPrive.setPaysEt(paysEt);
        paysEt.setNomPays(sc.nextLine());

        return etPrive;
    }

    @Override
    public void afficher(EtPrive etPrive) {
        System.out.println("========================INFORMATION DE L'ETUDIANT DU PRIVE==============================");
        System.out.println("Matricule : " +etPrive.getMat());
        System.out.println("Nom : "+ etPrive.getNom());
        System.out.println("Prenom : " +etPrive.getPrenom());
        System.out.println("Inscription : " +etPrive.getInscription());
        System.out.println("Mansualite : " +etPrive.getMensualite());
        System.out.println("Filiere : " +etPrive.getFiliere());
        System.out.println("Niveau : " +etPrive.getNiveau());
        System.out.println("Pays d'origine : " +etPrive.getPaysEt().getNomPays());

    }

}
