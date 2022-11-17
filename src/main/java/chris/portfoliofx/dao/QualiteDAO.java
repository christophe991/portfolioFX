package chris.portfoliofx.dao;

import chris.portfoliofx.metier.Qualite;
import chris.portfoliofx.service.QualiteSearch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class QualiteDAO extends DAO<Qualite, QualiteSearch>{
    public QualiteDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Qualite getById(int id) {

        return null;
    }

    @Override
    public ArrayList<Qualite> getAll() {
        ResultSet rs;
        ArrayList<Qualite> listeQualite = new ArrayList<>();
        try(Statement st = connexion.createStatement()){
            String str = "SELECT * FROM qualite order by nom";
            rs = st.executeQuery(str);
            while(rs.next()){
                listeQualite.add(new Qualite(rs.getInt(1),rs.getString(2)));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listeQualite;
    }

    @Override
    public ArrayList<Qualite> getLike(QualiteSearch objet) {
        return null;
    }

    @Override
    public boolean insert(Qualite objet) {
        return false;
    }

    @Override
    public boolean update(Qualite objet) {
        return false;
    }

    @Override
    public boolean delete(Qualite objet) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public ArrayList<Qualite> top(Qualite objet) {
        return null;
    }

    @Override
    public ArrayList<Qualite> last() {
        return null;
    }
}
