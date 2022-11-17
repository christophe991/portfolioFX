package chris.portfoliofx.service;

import chris.portfoliofx.dao.DAOFactory;
import chris.portfoliofx.metier.Qualite;

import java.util.ArrayList;

public class ServiceQualite {
    private ArrayList<Qualite> labelQualiteFiltre;

    public ServiceQualite(){
        labelQualiteFiltre = DAOFactory.getQualiteDAO().getAll();
    }
    public ArrayList<Qualite> getLabelQualiteFiltre() {
        return labelQualiteFiltre;
    }

    public ArrayList<Qualite> getFilteredQualite(QualiteSearch qualiteSearch){
        return DAOFactory.getQualiteDAO().getLike(qualiteSearch);
    }
}
