package chris.portfoliofx.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class PortfolioConnect {

    private  static Connection connexion;

    public PortfolioConnect(){

    }

    public static Connection getInstance(){
        if (connexion == null){
            try{
                String dbURL = "jdbc:mysql://127.0.0.1:3306/portfolio";
                String user = "root";
                String pass = "";
                connexion = DriverManager.getConnection(dbURL,user,pass);
                System.out.println("test");
            }catch (Exception e){
                e.printStackTrace();
            }

        }return connexion;
    }
}
