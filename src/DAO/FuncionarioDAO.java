/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Cliente;
import java.sql.Connection;
import Model.Funcionario;
import Model.Produto;
import Model.Veiculo;
import Model.Financas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author annal
 */
public class FuncionarioDAO {
    
    private final Connection connection;
    
    public FuncionarioDAO(Connection connection){
        this.connection = connection;
    }
    
    public ArrayList<Funcionario> todos() throws SQLException{
       
            
            String sql = "SELECT * FROM funcionario";
            PreparedStatement statement = connection.prepareStatement(sql);
            
        return PesquisaFuncionario(statement);
            
}

    private ArrayList<Funcionario> PesquisaFuncionario(PreparedStatement statement) throws SQLException {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome");
            String cpf  = result.getString("cpf");
            String endereco = result.getString("endereco");
            int idade = result.getInt("idade");
            String telefone = result.getNString("telefone");
            String sexo = result.getNString("sexo");
            int salario = result.getInt("salario");
            String cpfGerente = result.getNString("cpfGerente");
            
            
            Funcionario func = new Funcionario(nome, cpf, endereco, idade, telefone, sexo, salario, cpfGerente);
            funcionarios.add(func);
        }
        
        
        return funcionarios;
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
     
      private ArrayList<Veiculo> PesquisaVeiculo(PreparedStatement statement) throws SQLException {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String cpf_cliente = result.getString("cpf_cliente");
            String placa  = result.getString("placa");
            String modelo = result.getString("modelo");
            String cor = result.getNString("cor");
            int km_rodados = result.getInt("km_rodados");
           
            
            
            Veiculo func = new Veiculo (cpf_cliente,placa,modelo,cor,km_rodados);
            veiculos.add(func);
        }
        
        
        return veiculos;
    }
      
      
       private ArrayList<Produto> PesquisaProduto(PreparedStatement statement) throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome");
            int cod_produto  = result.getInt("cod_produto");
            int preco = result.getInt("preço");
            int quantidade = result.getInt("quant_produto");
           
            
            
            Produto func = new Produto(cod_produto,nome, preco, quantidade);
            produtos.add(func);
        }
        
        
        return produtos;
    }
    
       private ArrayList<Financas> PesquisaFinanca(PreparedStatement statement) throws SQLException {
        ArrayList<Financas> Financas = new ArrayList<Financas>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String caixa = result.getString("caixa");
            String Imposto  = result.getString("imposto");
            String Despesas = result.getString("despesas");
             String cod = result.getString("cod_acesso");
            
           
            
            
            Financas func = new Financas (caixa,Imposto,Despesas,cod);
            Financas.add(func);
        }
        
        
        return Financas;
    }
            
}

