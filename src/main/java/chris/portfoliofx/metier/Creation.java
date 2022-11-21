package chris.portfoliofx.metier;

import chris.portfoliofx.dao.DAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Creation {
    private Integer id;
    private String nom;
    private String description;

    public Creation() {
    }

    public Creation(Integer id) {
        this.id = id;
    }

    public Creation(Integer id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public IntegerProperty idPorperty(){
        return new SimpleIntegerProperty(id);
    }

    public StringProperty nomProperty(){
        return new SimpleStringProperty(nom);
    }

    public StringProperty descriptionProperty(){
        return new SimpleStringProperty(description);
    }

    public ArrayList<Creation> getAllCreations(){
        return DAOFactory.getCreationDAO().getAll();
    }

    @Override
    public String toString() {
        return "Creation{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
