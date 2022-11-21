package chris.portfoliofx.service;

import chris.portfoliofx.dao.DAOFactory;
import chris.portfoliofx.metier.Outil;

import java.util.ArrayList;

public class ServiceOutil {
    private ArrayList<Outil> labelOutilFiltre;

    public ServiceOutil(){
        labelOutilFiltre = DAOFactory.getOutilDAO().getAll();
    }

    public ArrayList<Outil> getLabelOutilFiltre() {
        return labelOutilFiltre;
    }

    public ArrayList<Outil> getFilteredOutil(OutilSearch outilSearch){
        return DAOFactory.getOutilDAO().getLike(outilSearch);
    }
}
