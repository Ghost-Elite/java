package sn.isi.metier;

import sn.isi.entities.Facture;

import java.util.List;

public interface IFacture {
    public int add(Facture facture) throws Exception;
    public List<Facture> liste() throws Exception;
    public int update(Facture facture) throws Exception;
}
