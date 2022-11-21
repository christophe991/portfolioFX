package chris.portfoliofx.dao;

import chris.portfoliofx.metier.Outil;
import chris.portfoliofx.service.OutilSearch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OutilDAO extends DAO<Outil, OutilSearch>{
    protected OutilDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Outil getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Outil> getAll() {
        ResultSet rs;
        ArrayList<Outil> listeOutil = new ArrayList<>();
        try (Statement st = connexion.createStatement()){
            String str = "select * from outil order by nom_outils";
            rs = st.executeQuery(str);
            while (rs.next()){
                listeOutil.add(new Outil(rs.getInt(1),rs.getString(2)));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listeOutil;
    }

    @Override
    public ArrayList<Outil> getLike(OutilSearch objet) {
        return null;
    }

    @Override
    public boolean insert(Outil objet) {
        return false;
    }

    @Override
    public boolean update(Outil objet) {
        return false;
    }

    @Override
    public boolean delete(Outil objet) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public ArrayList<Outil> top(Outil objet) {
        return null;
    }

    @Override
    public ArrayList<Outil> last() {
        return null;
    }
}
