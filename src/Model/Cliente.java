/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
   
    public Cliente(){
        
    }
    public Cliente(String nome,String cpf,String endereco, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    } 
    
    private ArrayList<Cliente> PesquisaCliente(PreparedStatement statement) throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            String endereco = result.getString("endereco");
            String telefone = result.getNString("telefone");
           
            
            
            Cliente func = new Cliente(nome, cpf, endereco, telefone);
            clientes.add(func);
        }
        
        
        return clientes;
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
}


