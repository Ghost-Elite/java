package enties;

public class Utilisateur {
    private int idU;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String profil;


    public Utilisateur() {
    }

    public Utilisateur(int idU, String login, String password, String nom, String prenom, String profil) {
        this.idU = idU;
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.profil = profil;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }
}
