/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

import java.util.Random;

/**
 *
 * @author ACER
 */

/// AGENTES OS QUAIS TRANSMITEM CARACTERISTICAS GENETICAS DE UM SER AO OUTRO
/// CROMOSSOMOS 
/// DNA
/// GENES

 /// CLASSE DNA PARA RECEBER A INFORMACOES DO ANIMAL GATO E DETERMINAR SE A VERIFICACAO DOS GENES E CARACTERISTICAS DO HERDADO
public class DNA {
    
    /// ATRIBUTOS
    private String genes;
    private String cromossomos;
    private double numbGenetica;
    
    /// PARA FILHO
    public DNA(){}
    
    /// PARA PAIS
    public DNA(Gato animal, String sexo, String parentesco){
        
        verificarCromossomos(sexo, parentesco, animal);
    }
    
    /// VERIFICAR ALGUMAS CARACTERISTICAS DO SER
    private void verificarCromossomos(String x_sexo, String x_parentesco, Gato x_animal){
        
        /// SE O SEXO FOR DIFERENTE, ENTAO A FORMACAO DO DNA E OUTRAS CARACTERISTICAS SERA DIFERENTE PARA CADA UM
        if(x_sexo.equalsIgnoreCase("f") && x_parentesco.equalsIgnoreCase("mae")){
            
            cromossomos = "23";
            setGenes(x_animal.getCor());
            Random genetica = new Random();
            numbGenetica = genetica.nextDouble();
        }else if(x_sexo.equalsIgnoreCase("m") && x_parentesco.equalsIgnoreCase("pai")){
            
            cromossomos = "23";
            setGenes(x_animal.getCor());
            Random genetica = new Random();
            numbGenetica = genetica.nextDouble();
            setGenes(x_animal.getCor());
        }
    }
    
    /// GET E SET
    /// METODO PARA ATRIBUIR A COR
    private void setGenes(String caracteristica){
        this.genes = caracteristica;
    }

    public String getGenes() {
        return genes;
    }

    public String getCromossomos() {
        return cromossomos;
    }

    public double getNumbGenetica() {
        return numbGenetica;
    }
    
    /// FUNCAO PARA FUNDIR O DNA E TRANSMITIR AS INFORMACOES PARA O SER FILHO
    public DNA fusionDNA(DNA pai, DNA mae){
        
        /// INSTANCIAR O DNA DO FILHO E UMA RANDOMICA
        DNA filhoDNA = new DNA();
        Random cor = new Random();
        
        /// PROCESSO DE TRANSFERENCIA DE INFORMACAO/CARATERISTICA DOS PAIS AO FILHO
        
            /// DEFININDO A COR DO GATO
            if(cor.nextBoolean() == true){

                filhoDNA.setGenes(pai.getGenes());
            }else{

                filhoDNA.setGenes(mae.getGenes());
            }

            int cromossomosFilho = Integer.parseInt(pai.getCromossomos()) + Integer.parseInt(mae.getCromossomos());
            filhoDNA.cromossomos = String.valueOf(cromossomosFilho);
            
            /// RANDOMICA PARA A GENETICA DO FILHO
            Random genetica = new Random();
            
            /// DEFININDO A GENETICA (SERA A SOMA SE O FILHO E DOS PAIS HERDADOS, SENAO TERA SUA GENETICA DE OUTROS PAIS)
            if(genetica.nextBoolean() == true){

                filhoDNA.numbGenetica = pai.getNumbGenetica() + mae.getNumbGenetica();
            }else{

                filhoDNA.numbGenetica = genetica.nextDouble();
            }
        
        return filhoDNA;
    }

}
