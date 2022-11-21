package chris.portfoliofx.metier;

import chris.portfoliofx.dao.DAOFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Outil {
    private Integer id;
    private String outil;

    public Outil() {
    }

    public Outil(Integer id) {
        this.id = id;
    }

    public Outil(Integer id, String outil) {
        this.id = id;
        this.outil = outil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutil() {
        return outil;
    }

    public void setOutil(String outil) {
        this.outil = outil;
    }

    public IntegerProperty idProperty(){
        return new SimpleIntegerProperty(id);
    }
    public StringProperty outilProperty(){
        return new SimpleStringProperty(outil);
    }
    public ArrayList<Outil> getAllOutils(){
        return DAOFactory.getOutilDAO().getAll();
    }

    @Override
    public String toString() {
        return "Outil{" +
                "id=" + id +
                ", outil='" + outil + '\'' +
                '}';
    }
}
