package chris.portfoliofx.dao;

import java.sql.Connection;

public class DAOFactory {
    public DAOFactory() {

    }

    private static final Connection connexion = PortfolioConnect.getInstance();

    public static QualiteDAO getQualiteDAO(){
        return new QualiteDAO(connexion);
    }
//
    public static FormationDAO getFormationDAO(){
        return new FormationDAO(connexion);
    }

     public static OutilDAO getOutilDAO() {
        return  new OutilDAO(connexion);
    }

    public static TechnologieDAO getTechnologieDAO(){
        return new TechnologieDAO(connexion);
    }

    public static CreationDAO getCreationDAO() {
        return  new CreationDAO(connexion);
    }

}
