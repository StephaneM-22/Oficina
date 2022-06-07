/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author danie
 */
public class Financas {

    /**
     * @return the Caixa
     */
    public String getCaixa() {
        return Caixa;
    }

    /**
     * @param Caixa the Caixa to set
     */
    public void setCaixa(String Caixa) {
        this.Caixa = Caixa;
    }

    /**
     * @return the Imposto
     */
    public String getImposto() {
        return Imposto;
    }

    /**
     * @param Imposto the Imposto to set
     */
    public void setImposto(String Imposto) {
        this.Imposto = Imposto;
    }

    /**
     * @return the Despesas
     */
    public String getDespesas() {
        return Despesas;
    }

    /**
     * @param Despesas the Despesas to set
     */
    public void setDespesas(String Despesas) {
        this.Despesas = Despesas;
    }
    
    
    private String Caixa;
    private String Imposto;
    private String Despesas;
    private String cod;
    
    
    public Financas (String Caixa, String Imposto, String Despesas, String cod){
    
    this.Caixa = Caixa;
    this.Despesas = Despesas;
    this.Imposto = Imposto;
    this.cod = cod;
    
    
    }

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }
    
}
