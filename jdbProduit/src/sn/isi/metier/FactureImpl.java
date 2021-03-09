package sn.isi.metier;

import sn.isi.entities.Facture;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FactureImpl implements IFacture{
    private DB db = new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(Facture facture) {
        try {
            String sql = "INSERT INTO facture VALUES(NULL, ?,?,?,?)";
            db.initPrepar(sql);

            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            db.getPtsm().setString(1,sdf.format(facture.getDate()));
            db.getPtsm().setInt(2,facture.getConsommation());
            db.getPtsm().setInt(3,facture.getPrix());
            db.getPtsm().setBoolean(4,facture.isPaiement());

            ok = db.executeMaj();
            db.closeConnection();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return ok;
    }

    @Override
    public List<Facture> liste() throws Exception{
        List<Facture> factures = new ArrayList<Facture>();
        String sql = "SELECT * FROM facture";
        db.initPrepar(sql);
        rs = db.executSelect();
        while (rs.next()){//tanqu'on arrive à recuperer un on creer une facture
            Facture f = new Facture();
            f.setIdF(rs.getInt(1));
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            f.setDate(sdf.parse(rs.getString(2)));
            f.setConsommation(rs.getInt(3));
            f.setPrix(rs.getInt(4));
            f.setPaiement(rs.getBoolean(5));

            //ajout de la facture dans la liste
            factures.add(f);
            db.closeConnection();
        }
        return factures;
    }

    @Override
    public int update(Facture facture)throws Exception {
        String sql = "UPDATE facture SET paiement = ? WHERE idF  = ?";
        db.initPrepar(sql);

        db.getPtsm().setBoolean(1,facture.isPaiement());
        db.getPtsm().setInt(2,facture.getIdF());

        ok = db.executeMaj();
        db.closeConnection();
        return ok;
    }
}
