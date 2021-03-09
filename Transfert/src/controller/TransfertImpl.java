package controller;

import sn.isi.entities.Tansfert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TransfertImpl implements ITransfert {
    Scanner sc = new Scanner(System.in);

    @Override
    public Tansfert saisie() {
        Date date = new Date();
        Tansfert t = new Tansfert();
        System.out.println("Entre l'id");
        t.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre le libelle");
        t.setLibelle(sc.nextLine());
        System.out.println("Entre le  montant");
        t.setMOntant(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre la date au format /jj/mm/an");
        t.setDate(date);
        return t;
    }

    @Override
    public void affichage(Tansfert tansfert) {
        System.out.println("ID : " + tansfert.getId());
        System.out.println("Libelle : " + tansfert.getLibelle());
        System.out.println("Montant : " + tansfert.getMOntant());
        System.out.println("Date : " + tansfert.getDate());
    }

    @Override
    public List<Tansfert> SaisieList() {
        String rep = null;
        List<Tansfert> list = new ArrayList<Tansfert>();
        do {
            list.add(saisie());
        } while (rep.equalsIgnoreCase("o"));


        return list;
    }

    @Override
    public void afficherListe(List<Tansfert> tansferts) {
        for (Tansfert tansfert : tansferts) {
            affichage(tansfert);
        }
    }

}
