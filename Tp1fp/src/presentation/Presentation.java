package presentation;

import controller.IFonction;
import controller.IFonctionTrait;
import entities.Salaire;

public class Presentation {
    public static void main(String[] args) {
        //traitement du salaire net
        IFonction iFonction  =
                x -> {
            return x.getSalBrut() - x.getRetenue();
        };

        //appel à la fonction de calcul salaire des employes

        Salaire emp = new Salaire(1, "Tamba","Yaya", 750000, 12000);
        double salaire = iFonction.getSalaireNet(emp);
        System.out.printf(emp.getPrenom() + "à comme salaire net :" +salaire);
        //traitement 2 du salaire net

        IFonctionTrait iFonction2 = sal -> {return (int) sal; };
        int salaire_entier = iFonction2.getSalaireEntier(iFonction.getSalaireNet(emp));
        System.out.println(emp.getPrenom() + "à comme salaire net arrondi :" +salaire_entier);
    }
}

