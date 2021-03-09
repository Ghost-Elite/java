package controller;

import entities.Transfert;

import java.awt.image.AreaAveragingScaleFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class TranfertImpl implements ITransfert {
    //saisie
    @Override
    public List<Transfert> saisie() {
        Scanner sc = new Scanner(System.in);
        String rep = null;
        Date date = new Date();

        ArrayList<Transfert> transferts = new ArrayList<Transfert>();
        do {
            Transfert t1 = new Transfert();

            System.out.println("Entre l'id du transfet");
            t1.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entre le libelle du transfert");
            t1.setLiblle(sc.nextLine());
            System.out.println("Entre le montat du transfert");
            t1.setMontant(Double.parseDouble(sc.nextLine()));
            System.out.println("Entre la date du transfert");

            try {
                SimpleDateFormat d = new SimpleDateFormat("DD/MM/YYYY");
                date = d.parse(sc.nextLine());
                t1.setDate(date);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            transferts.add(t1);
            System.out.println("Continue O/N");
            rep = sc.nextLine();

        } while (rep.equalsIgnoreCase("o"));


        return transferts;
    }

    //affichage

    @Override
    public void affichage(List<Transfert> transferts) {
        for (Transfert transfert : transferts) {
            System.out.println("ID : " + transfert.getId());
            System.out.println("Libelle :" + transfert.getLiblle());
            System.out.println("Montant :" + transfert.getMontant());
            System.out.println("Date :" + transfert.getDate());
        }
    }
}

