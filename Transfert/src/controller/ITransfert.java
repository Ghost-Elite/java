package controller;

import sn.isi.entities.Tansfert;

import java.util.List;

public interface ITransfert {

    public Tansfert saisie();
    public void affichage(Tansfert tansfert);
    public List<Tansfert> SaisieList();
    public void afficherListe(List<Tansfert>tansferts);


}
