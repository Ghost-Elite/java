package presentation;

import sn.isi.entities.Facture;
import sn.isi.entities.Reglement;
import sn.isi.metier.FactureImpl;
import sn.isi.metier.IFacture;
import sn.isi.metier.IReglement;
import sn.isi.metier.ReglementImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException,Exception, IOException , SQLException {
      /*  Facture  f = new Facture();

        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

        f.setDate(sdf.parse("2021-01-24"));
        f.setConsommation(85646);
        f.setPrix(8552);
        f.setPaiement(false);


        try {
            IFacture iFacture = new FactureImpl();
           int ok = iFacture.add(f);
            System.out.println(ok);
        }catch (Exception ex){
            ex.printStackTrace();
        }*/
       /* Reglement r = new Reglement();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        r.setDate(sdf.parse("2021-02-10"));
        Facture f = new Facture();
        f.setIdF(2);
        r.setFacture(f);
        try {
            //reglement de la facture
            IReglement ir = new ReglementImpl();
            ir.add(r);
        }catch (Exception e){
            e.printStackTrace();
        }
        f.setPaiement(true);
        try {
            //mise à jour de la facture
            IFacture iFacture = new FactureImpl();
            iFacture.update(f);
        }catch (Exception e){
            e.printStackTrace();
        }
*/

            IFacture iFacture = new FactureImpl();
            File etatFacture = new File("etatFacture.csv");
            List<Facture> factures = iFacture.liste();
            FileWriter fileWriter = new FileWriter(etatFacture);
            fileWriter.write("ID;Date;Consommation;Prix;Paiement");
            for (Facture f : factures){
                SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
                String fact = f.getIdF()+";"+sdf.format(f.getDate())
                        +";"+f.getConsommation()
                        +";"+f.getPrix()
                        +";"+f.isPaiement();
                fileWriter.write(fact);
            }
            fileWriter.close();
        System.out.println("fichier creer");




    }
}
