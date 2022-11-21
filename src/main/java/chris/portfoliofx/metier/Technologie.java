package chris.portfoliofx.metier;

import chris.portfoliofx.dao.DAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Technologie {
    private Integer id;
    private String langage;

    public Technologie() {
    }

    public Technologie(Integer id) {
        this.id = id;
    }

    public Technologie(Integer id, String langage) {
        this.id = id;
        this.langage = langage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public IntegerProperty idProperty(){
        return new SimpleIntegerProperty(id);
    }

    public StringProperty langageProperty(){
        return new SimpleStringProperty(langage);
    }
    public ArrayList<Technologie> getAllTechnologies(){
        return DAOFactory.getTechnologieDAO().getAll();
    }
    @Override
    public String toString() {
        return "Technologie{" +
                "id=" + id +
                ", langage='" + langage + '\'' +
                '}';
    }
}
