package chris.portfoliofx.service;

import chris.portfoliofx.dao.DAOFactory;
import chris.portfoliofx.metier.Formation;

import java.util.ArrayList;

public class ServiceFormation {
    private ArrayList<Formation> labelFormationFiltre;

    public ServiceFormation(){
        labelFormationFiltre = DAOFactory.getFormationDAO().getAll();
    }

    public ArrayList<Formation> getLabelFormationFiltre() {
        return labelFormationFiltre;
    }

    public ArrayList<Formation> getFilteredFormation(FormationSearch formationSearch){
        return DAOFactory.getFormationDAO().getLike(formationSearch);

    }
}
