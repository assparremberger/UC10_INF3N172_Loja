
package dao;

import java.util.Calendar;
import model.Cliente;

/**
 *
 * @author assparremberger
 */
public class ClienteDAO {
    
    public static void inserir(Cliente cliente){
        String data = "" + cliente.getNascimento().get(Calendar.YEAR)
                + "-" + (cliente.getNascimento().get(Calendar.MONTH)+1)
                + "-" + cliente.getNascimento().get(Calendar.DAY_OF_MONTH);
        String sql = "INSERT INTO clientes "
            + "(nome, telefone, cpf, salario, filhos, casado, "
            + " sexo, dataNascimento, codCidade ) VALUES ( "
            + " '" + cliente.getNome()     + "' , "
            + " '" + cliente.getTelefone() + "' , "
            + " '" + cliente.getCpf()      + "' , "
            + "  " + cliente.getSalario()  + "  , "
            + "  " + cliente.isTemFilhos() + "  , "
            + "  " + cliente.isCasado()    + "  , "
            + " '" + cliente.getSexo()     + "' , "
            + " '" + data                  + "' , "
            + "  " + cliente.getCidade().getCodigo() 
            + " ) "    ;
        
        Conexao.executar(sql);
    }
    
    public static void editar(Cliente cliente){
        String data = "" + cliente.getNascimento().get(Calendar.YEAR)
                + "-" + (cliente.getNascimento().get(Calendar.MONTH)+1)
                + "-" + cliente.getNascimento().get(Calendar.DAY_OF_MONTH);
        String sql = "UPDATE clientes SET "
            + " nome           = '" + cliente.getNome()     + "' , "
            + " telefone       = '" + cliente.getTelefone() + "' , "
            + " cpf            = '" + cliente.getCpf()      + "' , "
            + " salario        =  " + cliente.getSalario()  + "  , "
            + " filhos         =  " + cliente.isTemFilhos() + "  , "
            + " casado         =  " + cliente.isCasado()    + "  , "
            + " sexo           = '" + cliente.getSexo()     + "' , "
            + " dataNascimento = '" + data                  + "' , "
            + " codCidade      =  " + cliente.getCidade().getCodigo() 
            + " WHERE codigo   =  " + cliente.getCodigo() ;
        
        Conexao.executar(sql);
    }
    
    public static void excluir(Cliente cliente){
        String sql = "DELETE FROM clientes "
            + " WHERE codigo   =  " + cliente.getCodigo() ;
        Conexao.executar(sql);
    }
}












