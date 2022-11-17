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

    public Qualite() {
    }

    public Qualite(Integer id) {
        this.id = id;
    }

    public Qualite(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public ArrayList<Qualite> getAllQualite(){
        return DAOFactory.getQualiteDAO().getAll();
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

    @Override
    public String toString() {
        return "Qualite{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
