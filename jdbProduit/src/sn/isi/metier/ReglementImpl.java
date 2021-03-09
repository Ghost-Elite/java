package sn.isi.metier;

import sn.isi.entities.Reglement;

import java.text.SimpleDateFormat;

public class ReglementImpl implements IReglement{

    private DB db = new DB();

    private  int ok;

    @Override
    public int add(Reglement reglement) throws Exception {
        String sql = "INSERT INTO reglement VALUES(NULL, ?,?)";
        db.initPrepar(sql);

        //gestion des dates en java
        SimpleDateFormat  sdf = new SimpleDateFormat("yyy-MM-dd");

        db.getPtsm().setString(1,sdf.format(reglement.getDate()));
        db.getPtsm().setInt(2,reglement.getFacture().getIdF());

        ok = db.executeMaj();

        return ok;
    }
}
