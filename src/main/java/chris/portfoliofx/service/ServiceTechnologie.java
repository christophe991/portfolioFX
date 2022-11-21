package chris.portfoliofx.service;

import chris.portfoliofx.dao.DAOFactory;
import chris.portfoliofx.metier.Technologie;

import java.util.ArrayList;

public class ServiceTechnologie {

    private ArrayList<Technologie> labelTechnologieFiltre;

    public ServiceTechnologie(){
        labelTechnologieFiltre = DAOFactory.getTechnologieDAO().getAll();
    }

    public ArrayList<Technologie> getLabelTechnologieFiltre() {
        return labelTechnologieFiltre;
    }

    public ArrayList<Technologie> getFilteredTechnologie(TechnologieSearch technologieSearch){
        return DAOFactory.getTechnologieDAO().getLike(technologieSearch);
    }
}
