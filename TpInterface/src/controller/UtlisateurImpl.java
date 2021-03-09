package controller;

import enties.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UtlisateurImpl implements IUtilisateur{
    Scanner sc = new Scanner(System.in);
    @Override
    public Utilisateur saisie() {
        Utilisateur u = new Utilisateur();
        System.out.printf("Saisir l'id");
        u.setIdU(Integer.parseInt(sc.nextLine()));

        System.out.printf("Saisir login");
        u.setLogin(sc.nextLine());

        System.out.printf("Saisir password");
        u.setPassword(sc.nextLine());

        System.out.printf("Saisir nom");
        u.setNom(sc.nextLine());

        System.out.printf("Saisir prenom");
        u.setPrenom(sc.nextLine());
        return null;
    }

    @Override
    public void affichage(Utilisateur u) {

    }

    @Override
    public List<Utilisateur> saisieListe() {
        String rep = null;
        List<Utilisateur> Liste = new ArrayList<Utilisateur>();
        do {
            Liste.add(saisie());
            System.out.printf("Congtinuer o/n");
            rep= sc.nextLine();
        }while (rep.equalsIgnoreCase("o"));
        return Liste;
    }

    @Override
    public void affichageListe(List<Utilisateur> users) {
        for (Utilisateur u:users){
            affichage(u);
        }
    }

    @Override
    public Map<String, Utilisateur> copie(List<Utilisateur> users) {
        return null;
    }
}
