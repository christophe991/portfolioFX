package chris.portfoliofx.metier;

import chris.portfoliofx.dao.DAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Formation {

    private Integer id;
    private String intitule;
    private String centre;
    private String annee;


    public Formation() {
    }

    public Formation(Integer id) {
        this.id = id;
    }

    public Formation(Integer id, String intitule, String centre, String annee) {
        this.id = id;
        this.intitule = intitule;
        this.centre = centre;
        this.annee = annee;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
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

    public ArrayList<Formation> getAllFormation(){
        return DAOFactory.getFormationDAO().getAll();
    }

    public IntegerProperty idProperty(){
        return new SimpleIntegerProperty(id);
    }

    public StringProperty intituleProperty(){
        return new SimpleStringProperty(intitule);
    }

    public StringProperty centreProperty(){
        return new SimpleStringProperty(centre);
    }

    public StringProperty anneeProperty(){
        return new SimpleStringProperty(annee);
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", intitule='" + intitule + '\'' +
                ", centre='" + centre + '\'' +
                ", annee='" + annee + '\'' +
                '}';
    }
}
