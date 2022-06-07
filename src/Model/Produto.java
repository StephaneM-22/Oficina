/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author danie
 */
public class Produto {
    
    private int cod_produto;
    private String nome;
    private int preco;
    private int quantidade;
    
    public Produto(int cod_produto, String nome,int preco, int quantidade){
        
        this.cod_produto = cod_produto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
        
    }

    /**
     * @return the cod_prodruto
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     * @param cod_prodruto the cod_prodruto to set
     */
    public void setCod_produto(int cod_prodruto) {
        this.cod_produto = cod_prodruto;
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
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
