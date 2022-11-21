package chris.portfoliofx.service;

import chris.portfoliofx.dao.DAOFactory;
import chris.portfoliofx.metier.Creation;

import java.util.ArrayList;

public class ServiceCreation {

    private ArrayList<Creation> labelCreationFiltre;

    public ServiceCreation(){
        labelCreationFiltre = DAOFactory.getCreationDAO().getAll();
    }
    public ArrayList<Creation> getLabelCreationFiltre() {
        return labelCreationFiltre;
    }

    public ArrayList<Creation> getFilteredCreation(CreationSearch creationSearch){
        return DAOFactory.getCreationDAO().getLike(creationSearch);
    }
}
