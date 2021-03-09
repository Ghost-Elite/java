package main;

import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.UserImp;

public class Main {
    public static void main(String[] args) {
        /**
         * instanciation
         */

        IUser user = new UserImp();
        User u = user.saisie();

        user.afficher(u);


    }
}
