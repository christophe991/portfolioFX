package chris.portfoliofx.service;

public class QualiteSearch {
    private Integer id;
    private String nom;

    private String resume;

    public QualiteSearch(Integer id, String nom, String resume) {
        this.id = id;
        this.nom = nom;
        this.resume = resume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
