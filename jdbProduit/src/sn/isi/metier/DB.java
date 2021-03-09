package sn.isi.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    //connexion
    private Connection cnx;
    //pour les requets de type select
    private ResultSet rs;
    //pour les requets  prepares
    private PreparedStatement ptsm;
    //pour les requets detype mise à jour MAJ(INSERT ,UPDATE,DELET)
    private  int ok;
    private void getConnection() throws Exception{
        String url = "jdbc:mysql://localhost:3306/gestionFacture";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection(url,user,password);
    }
    public void initPrepar(String sql) throws Exception{
        getConnection();
        ptsm = cnx.prepareStatement(sql);
    }
    public ResultSet executSelect() throws Exception{
        //rs = null;
        rs = ptsm.executeQuery();//execution des requets types de select
        return rs;
    }
    public int executeMaj(){
        try {
            ok = ptsm.executeUpdate();//execution des rquets de type update
        }catch (Exception ex){
            ex.printStackTrace();
        }

       return ok;

    }
    public void closeConnection()throws Exception{
        if (cnx != null){
            cnx.close();
        }
    }

    public PreparedStatement getPtsm() {
        return ptsm;
    }

    public void setPtsm(PreparedStatement ptsm) {
        this.ptsm = ptsm;
    }
}
