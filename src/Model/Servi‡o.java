/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vini2
 */
public class Serviço {
    private int codigo;
    private int preço;
    private String tipo;
    
    
    
    public Serviço(int codigo,int preço,String tipo){
        this.codigo = codigo;
        this.preço = preço;
        this.tipo = tipo;
        
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the preço
     */
    public int getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(int preço) {
        this.preço = preço;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
