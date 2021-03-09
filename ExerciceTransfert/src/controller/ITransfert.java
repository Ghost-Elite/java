package controller;

import entities.Transfert;

import java.util.List;

public interface ITransfert {

    //saisie liste
    public List<Transfert> saisie();

    //affichage liste
    public void affichage(List<Transfert> transferts);

}
