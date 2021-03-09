package presentation;

import controller.IProfesseur;
import entities.Professeur;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IProfesseur p = new IProfesseur() {
            @Override
            public Professeur creation() {
                Scanner sc = new Scanner(System.in);
                Professeur p = new Professeur();
                System.out.println("Entre l'id");
                p.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Entre votre nom");
                p.setNom(sc.nextLine());
                System.out.println("Entre votre prenom");
                p.setPrenom(sc.nextLine());

                return null;
            }

            @Override
            public void affichage(Professeur professeur) {

            }

            @Override
            public Map<Integer, Professeur> copie(Professeur professeur) {
                return null;
            }
        };
    }
}
