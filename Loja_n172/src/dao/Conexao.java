package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author assparremberger
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/loja_n172?zeroDateTimeBehavior=convertToNull";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver ";
    
    
    public static  boolean executar(String sql){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL);
            Statement st = conn.createStatement();
            return st.execute(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
    public static ResultSet consultar(String sql){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL);
            Statement st = conn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            return null;
        }
    }
}
