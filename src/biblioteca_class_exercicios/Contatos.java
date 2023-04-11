/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ==============================================================================
/// ARQUIVO - 3

/// CLASSE CONTATO PARA MANTER A INFORMACAO DE ALGUEM COMO UM CONTATO
public class Contatos {
    
    /// ATRIBUTOSB
    private String nome;
    private int numero;
    private String email;
    
    /// CONSTRUTOR
    public Contatos(String nome, int numero, String email){
           this.nome = nome;
           this.numero = numero;
           this.email = email;
    }
    
    public Contatos(){}
    
    /// GET E SET
    public void setNome(String _nome){
        this.nome = _nome;
    }
    
    public void setNumero(int _numb_x){
        this.numero = _numb_x;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setEmail(String _email){
        this.email = _email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
}
