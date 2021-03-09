package main;

import controller.ITransfert;
import controller.TranfertImpl;
import entities.Transfert;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ITransfert t2 = new TranfertImpl();
        ArrayList<Transfert> t3 = (ArrayList<Transfert>) t2.saisie();
        t2.affichage((List<Transfert>) t3);

    }
}
