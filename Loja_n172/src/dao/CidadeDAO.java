package dao;

import javax.swing.JOptionPane;
import model.Cidade;

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
    
   
}



