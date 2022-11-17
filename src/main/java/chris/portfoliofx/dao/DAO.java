package chris.portfoliofx.dao;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO <T,S>{
    protected Connection connexion;

    protected DAO(Connection connexion){
        this.connexion = connexion;
    }
    public abstract T getById(int id);
    public abstract ArrayList<T> getAll();
    public abstract ArrayList<T> getLike(S objet);

    public abstract boolean insert(T objet);
    public abstract boolean update(T objet);
    public abstract boolean delete(T objet);
    public abstract boolean deleteById(int id);

    public abstract ArrayList<T> top(T objet);
    public abstract ArrayList<T> last();


}
