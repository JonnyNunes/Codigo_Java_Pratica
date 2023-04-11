/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// CLASSE GATO
public class Gato {
    
    private String nome;
    private String cor;
    private short idade;
    private String sexo;
    private DNA dna;

    /// PARA FILHOS (AS)
    public Gato(String nome, short idade, String sexo, Gato pai, Gato mae) {
        
        this.sexo = sexo;
        this.nome = nome;
        this.idade = idade;
        dna = new DNA();
        
        /// REPASSANDO A FUSAO DO DNA AO FILHO PELO HERDEIRO
        dna = dna.fusionDNA(pai.getDna(), mae.getDna());
        
        this.cor = dna.getGenes();
    }
    
    /// PARA PAIS (HERDEIROS)
    public Gato(String nome, String cor, short idade, String sexo, String parentesco) {
        
        this.sexo = sexo;
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        
        /// RECEBENDO O NOVO DNA
        dna = new DNA(Gato.this, sexo, parentesco);
    }
    
    /// GET
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public short getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    private DNA getDna() {
        return dna;
    }
    
    /// METEDO PARA VEREFICAR SE O SER E IRMAO OU NAO
    public boolean verificarDNA(Gato x_Gato){
    
        if(x_Gato.getDna().getNumbGenetica() == getDna().getNumbGenetica()){
            return true;
        }
        
        return false;
    }
    
}
