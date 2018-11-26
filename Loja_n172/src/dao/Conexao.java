package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author assparremberger
 */
public class Conexao {
    
    private static final String BANCO = "n172_adalto_loja";
    private static final String LOCAL = "senacinfo-db";
    private static final String URL = "jdbc:mysql://" + LOCAL + ":3306/" + BANCO + "?zeroDateTimeBehavior=convertToNull";
    private static final String USUARIO = "assparremberger";
    private static final String SENHA = "senacrs";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    
    public static  boolean executar(String sql){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            Statement st = conn.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public static ResultSet consultar(String sql){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            Statement st = conn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}
