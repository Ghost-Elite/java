package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.*;

public class EcoleImpl implements IEcole{
    @Override
    public Map<Specialite, Ecole> saisie() {
        Scanner sc = new Scanner(System.in);
        Ecole ecole = null;
        Specialite specialite =null;
        Map<Specialite,Ecole> ecoleList = new Hashtable<Specialite,Ecole>();
        String rep = null;
        do {
            ecole = new Ecole();
             specialite = new Specialite();
            System.out.println("Entre le id");
            ecole.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entre le nom de l'ecole");
            ecole.setNom(sc.nextLine());
            System.out.println("Entre l'id de la specialité:");
            specialite.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entre le nom de la specialite");
            specialite.setNomSpe(sc.nextLine());
            System.out.println("Voulez vous continuer O/N");
            ecole.setSpecialite(specialite);
            ecoleList.put(ecole.getSpecialite(),ecole);
            rep = sc.nextLine();
        }while (rep.equalsIgnoreCase("o"));
        return ecoleList;
    }

    @Override
    public void affichageEcoles(Map<Specialite, Ecole> maps) {
        Collection<Ecole> ecoles = maps.values();
        for (Ecole  ecole : ecoles){
            System.out.println("ID :"+ecole.getId());
            System.out.println("Nom :"+ecole.getNom());
            System.out.println("ID sp:"+ecole.getSpecialite().getId());
            System.out.println("Nom sp:"+ecole.getSpecialite().getNomSpe());
        }
    }


   /* @Override
    public Map<Specialite, Ecole> saisie(Map<Ecole, Specialite> ecoleSpecialiteMap) {



        return ecoleList;
    }*/




}
