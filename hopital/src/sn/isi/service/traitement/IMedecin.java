package sn.isi.service.traitement;

import sn.isi.entities.Medecin;

import java.util.List;

public interface IMedecin {
    /**
     * declaration des methode de l'interface medecin
     * @return
     */
    public Medecin saisie();
    public void afficher(Medecin medecin);

}
