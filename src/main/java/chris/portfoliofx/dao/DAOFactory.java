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
//    public static EditeurDAO getEditeurDAO(){
//        return new EditeurDAO(connexion);
//    }
//
//     public static PlateformeDAO getPlateformeDAO() {
//        return  new PlateformeDAO(connexion);
//    }
//
//    public static GenreDAO getGenreDAO(){
//        return new GenreDAO(connexion);
//    }
//
//    public static RealisateurDAO getRealisateurDAO() {
//        return  new RealisateurDAO(connexion);
//    }
//    public static FilmDAO getFilmDAO(){
//        return new FilmDAO(connexion);
//    }
//    public static SerieDAO getSerieDAO(){
//        return new SerieDAO(connexion);
//    }
}
