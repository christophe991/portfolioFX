package chris.portfoliofx.dao;

import chris.portfoliofx.metier.Technologie;
import chris.portfoliofx.service.TechnologieSearch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TechnologieDAO extends DAO<Technologie, TechnologieSearch>{
    protected TechnologieDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Technologie getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Technologie> getAll() {
        ResultSet rs;
        ArrayList<Technologie> listeTechnologie = new ArrayList<>();
        try(Statement st = connexion.createStatement()){
            String  str = "select * from technologie order by langage";
            rs = st.executeQuery(str);
            while (rs.next()){
                listeTechnologie.add(new Technologie(rs.getInt(1), rs.getString(2)));

            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listeTechnologie;
    }

    @Override
    public ArrayList<Technologie> getLike(TechnologieSearch objet) {
        return null;
    }

    @Override
    public boolean insert(Technologie objet) {
        return false;
    }

    @Override
    public boolean update(Technologie objet) {
        return false;
    }

    @Override
    public boolean delete(Technologie objet) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public ArrayList<Technologie> top(Technologie objet) {
        return null;
    }

    @Override
    public ArrayList<Technologie> last() {
        return null;
    }
}
