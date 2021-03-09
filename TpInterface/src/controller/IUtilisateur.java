package controller;

import enties.Utilisateur;

import java.util.List;
import java.util.Map;

public interface IUtilisateur {
    public Utilisateur saisie();
    public void affichage(Utilisateur u);
    public List<Utilisateur> saisieListe();
    public  void affichageListe (List<Utilisateur> users);
    public Map<String, Utilisateur> copie(List<Utilisateur> users);

}
