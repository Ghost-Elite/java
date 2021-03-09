package sn.isi.presentation;

import sn.isi.entities.Rn;

public interface IRn {
    /**
     * la methode qui permet de saisir un route rn
     * @return
     */
    public Rn saisie();

    /**
     * methode qui afficher un rn
     * @param rn
     */
    public void affichage(Rn rn);
}
