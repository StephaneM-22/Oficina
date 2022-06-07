/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author annal
 */
public class Funcionario {
    
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;
    private String telefone;
    private String sexo;
    private int salario;
    private String cpfGerente;
    
    
    
    
    public Funcionario(String nome,String cpf,String endereco,int idade, String telefone, String sexo, int salario, String cpfGerente){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.salario = salario;
        this.cpfGerente = cpfGerente;
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the cpfGerente
     */
    public String getCpfGerente() {
        return cpfGerente;
    }

    /**
     * @param cpfGerente the cpfGerente to set
     */
    public void setCpfGerente(String cpfGerente) {
        this.cpfGerente = cpfGerente;
    }
    
 
    
}
