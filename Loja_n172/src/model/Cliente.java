package model;

import java.util.Calendar;

/**
 *
 * @author assparremberger
 */
public class Cliente {
    
    public static final String FEMININO = "f";
    public static final String MASCULINO = "m";
    
    
    private int codigo;
    private String nome, cpf, sexo, telefone;
    private Calendar nascimento;
    private boolean temFilhos, casado;
    private Cidade cidade;
    private Estado estado;
    private double salario;

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    
    
    public Cliente() {
    }
    
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public Cliente(int codigo) {
        this.codigo = codigo;
    }
    
    public Cliente(String nome, String telefone) {
        this.nome = nome;
    }

    public Cliente(int codigo, String nome, String cpf, String sexo, String telefone, Calendar nascimento, boolean temFilhos, Cidade cidade, Estado estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.temFilhos = temFilhos;
        this.cidade = cidade;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public boolean isTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    
}
