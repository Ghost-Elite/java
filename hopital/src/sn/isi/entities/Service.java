package sn.isi.entities;

public class Service {
    /**
     * declaration des attributs
     */
    private int id;
    private String nomService;

    /**
     * constructeur sans argument
     */
    public Service() {
    }

    /**
     * constructeur avec argument
     * @param id
     * @param nomService
     */
    public Service(int id, String nomService) {
        this.id = id;
        this.nomService = nomService;
    }

    /**
     * les getteurs et les setteurs
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
}
