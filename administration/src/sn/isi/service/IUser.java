package sn.isi.service;

import sn.isi.entities.User;

public interface IUser {
    /**
     * creation des methodes de l'interface
     * @return
     */

    public User saisie();
    public void afficher (User u);
}
