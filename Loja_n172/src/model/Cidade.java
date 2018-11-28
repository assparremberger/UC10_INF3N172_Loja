package model;
/**
 *
 * @author assparremberger
 */
public class Cidade {
    
    private int codigo;
    private String nome;
    private Estado estado;

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public Cidade() {
        
    }
    

    public Cidade(int codigo, String nome, Estado estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
