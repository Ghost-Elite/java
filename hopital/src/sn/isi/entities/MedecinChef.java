package sn.isi.entities;

public class MedecinChef extends Medecin{
    private String bureau;

    /**
     * constructeur sans argument
     */
    public MedecinChef() {
    }

    /**
     * constructeur avec argument
     * @param id
     * @param password
     * @param nom
     * @param prenom
     * @param service
     * @param bureau
     */
    public MedecinChef(int id, String password, String nom, String prenom, Service service, String bureau) {
        super(id, password, nom, prenom, service);
        this.bureau = bureau;
    }

    /**
     * les getteurs et stteurs
     * @return
     */
    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
    /**
     * methode qui permet d'afficher le nom de la class :)
     */
    public void med(){
        System.out.println("===================INFORMATION "+getClass().getSimpleName()+"=======================");
    }
}
