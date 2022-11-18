package chris.portfoliofx.dao;

import chris.portfoliofx.metier.Formation;
import chris.portfoliofx.service.FormationSearch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FormationDAO extends DAO<Formation, FormationSearch> {

    protected FormationDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Formation getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Formation> getAll() {
        ResultSet rs;
        ArrayList<Formation> listeFormation = new ArrayList<>();
        try(Statement st = connexion.createStatement()){
            String str = "select * from formation oeder order by annee desc";
            rs = st.executeQuery(str);
            while(rs.next()){
                listeFormation.add(new Formation(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listeFormation;
    }

    @Override
    public ArrayList<Formation> getLike(FormationSearch objet) {
        return null;
    }

    @Override
    public boolean insert(Formation objet) {
        return false;
    }

    @Override
    public boolean update(Formation objet) {
        return false;
    }

    @Override
    public boolean delete(Formation objet) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public ArrayList<Formation> top(Formation objet) {
        return null;
    }

    @Override
    public ArrayList<Formation> last() {
        return null;
    }
}
