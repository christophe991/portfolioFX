package chris.portfoliofx.dao;

import chris.portfoliofx.metier.Creation;
import chris.portfoliofx.service.CreationSearch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CreationDAO extends DAO<Creation, CreationSearch> {
    protected CreationDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Creation getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Creation> getAll() {
        ResultSet rs;
        ArrayList<Creation> listeCreation = new ArrayList<>();
        try(Statement st = connexion.createStatement()){
            String str = "select * from creation order by nom";
            rs = st.executeQuery(str);
            while (rs.next()){
                listeCreation.add(new Creation(rs.getInt(1),rs.getString(2),rs.getString(3)));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listeCreation;
    }

    @Override
    public ArrayList<Creation> getLike(CreationSearch objet) {
        return null;
    }

    @Override
    public boolean insert(Creation objet) {
        return false;
    }

    @Override
    public boolean update(Creation objet) {
        return false;
    }

    @Override
    public boolean delete(Creation objet) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public ArrayList<Creation> top(Creation objet) {
        return null;
    }

    @Override
    public ArrayList<Creation> last() {
        return null;
    }
}
