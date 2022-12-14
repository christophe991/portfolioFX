package chris.portfoliofx.metier;

import chris.portfoliofx.dao.DAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Qualite {
    private Integer id;
    private String nom;

    private String resume;

    public Qualite() {
    }

    public Qualite(Integer id) {
        this.id = id;
    }

    public Qualite(Integer id, String nom, String resume) {
        this.id = id;
        this.nom = nom;
        this.resume = resume;
    }

    public ArrayList<Qualite> getAllQualite(){
        return DAOFactory.getQualiteDAO().getAll();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
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

    public IntegerProperty idProperty(){
        return new SimpleIntegerProperty(id);
    }

    public StringProperty nomProperty(){
        return new SimpleStringProperty(nom);
    }

    public StringProperty resumeProperty(){
        return new SimpleStringProperty(resume);
    }

    @Override
    public String toString() {
        return "Qualite{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", resume='" + resume + '\'' +
                '}';
    }
}
