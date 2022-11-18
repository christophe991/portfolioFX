package chris.portfoliofx.service;

public class FormationSearch {

    private Integer id;
    private String intitule;
    private String centre;
    private String annee;

    public FormationSearch(Integer id, String intitule, String centre, String annee) {
        this.id = id;
        this.intitule = intitule;
        this.centre = centre;
        this.annee = annee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
