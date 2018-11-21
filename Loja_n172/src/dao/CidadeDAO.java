package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Estado;

/**
 *
 * @author assparremberger
 */
public class CidadeDAO {
    
    public static void inserir(Cidade cidade){
        String sql = "INSERT INTO cidades ( nome, codEstado ) "
                + " VALUES ( '" + cidade.getNome() + "' , "
                        + "   " + cidade.getEstado().getCodigo() +" ) ";
        boolean retorno = Conexao.executar( sql );
        if( !retorno ){
            JOptionPane.showMessageDialog(null, "Erro ao inserir a cidade");
        }
        
    }
    
    public static void editar(Cidade cidade){
        String sql = "UPDATE cidades SET  "
                + " nome =  '" + cidade.getNome() + "' , "
                + " codEstado =  " + cidade.getEstado().getCodigo() +"  "
                + " WHERE codigo = " + cidade.getCodigo();
        boolean retorno = Conexao.executar( sql );
        if( !retorno ){
            JOptionPane.showMessageDialog(null, "Erro ao editar a cidade");
        }
        
    }
    
    public static void excluir(Cidade cidade){
        String sql = "DELETE FROM cidades  "
                  + " WHERE codigo = " + cidade.getCodigo();
        boolean retorno = Conexao.executar( sql );
        if( !retorno ){
            JOptionPane.showMessageDialog(null, "Erro ao excluir a cidade");
        }
        
    }
    
    
    public static List<Cidade> getCidades(){
        String sql = " SELECT c.codigo, c.nome, c.codEstado, e.nome "
                   + " FROM cidades c "
                   + " INNER JOIN estados e   "
                   + " ON c.codEstado = e.codigo "
                   + " ORDER BY c.nome ";
        List<Cidade> lista = new ArrayList<>();
        ResultSet rs = Conexao.consultar( sql );
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Estado est = new Estado();
                    est.setCodigo( rs.getInt( 3 ) );
                    est.setNome( rs.getString( 4 ) );
                    
                    Cidade cid = new Cidade();
                    cid.setCodigo( rs.getInt(1) );
                    cid.setNome( rs.getString(2) );
                    cid.setEstado( est );
                    lista.add( cid );
                }
            } catch (Exception e) {
                
            }
        }
        return lista;
    }
    
    public static List<Cidade> getCidades(int codEstado){
        String sql = " SELECT c.codigo, c.nome, c.codEstado, e.nome "
                   + " FROM cidades c "
                   + " INNER JOIN estados e   "
                   + " ON c.codEstado = e.codigo "
                   + " WHERE e.codigo = " + codEstado
                   + " ORDER BY c.nome ";
        List<Cidade> lista = new ArrayList<>();
        ResultSet rs = Conexao.consultar( sql );
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Estado est = new Estado();
                    est.setCodigo( rs.getInt( 3 ) );
                    est.setNome( rs.getString( 4 ) );
                    
                    Cidade cid = new Cidade();
                    cid.setCodigo( rs.getInt(1) );
                    cid.setNome( rs.getString(2) );
                    cid.setEstado( est );
                    lista.add( cid );
                }
            } catch (Exception e) {
                
            }
        }
        return lista;
    }
    
    public static Cidade getCidadeByCodigo(int codigo){
        String sql = " SELECT c.codigo, c.nome, c.codEstado, e.nome "
                   + " FROM cidades c "
                   + " INNER JOIN estados e   "
                   + " ON c.codEstado = e.codigo "
                   + " WHERE c.codigo = " + codigo
                   + " ORDER BY c.nome ";
        ResultSet rs = Conexao.consultar( sql );
        if( rs != null ){
            try {
                 rs.next();                    
                    Estado est = new Estado();
                    est.setCodigo( rs.getInt( 3 ) );
                    est.setNome( rs.getString( 4 ) );
                    
                    Cidade cid = new Cidade();
                    cid.setCodigo( rs.getInt(1) );
                    cid.setNome( rs.getString(2) );
                    cid.setEstado( est );
                    return cid;
            } catch (Exception e) {
                
            }
        }
        return null;
    }
   
}
