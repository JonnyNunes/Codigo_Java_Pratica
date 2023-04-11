/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;


import biblioteca_class_exercicios.Gato;
/**
 *
 * @author ACER
 */

/*
33º Crie uma classe "Gato" com os atributos "nome", "cor" e "idade". 
Escreva um método que determine se dois gatos são irmãos ou não, considerando 
que dois gatos são irmãos se tiverem a mesma mãe e o mesmo pai.
*/

/// OS GATOS PAIS SAO GERADOS POR DNA DIFERETNES QUE SAO DISTRIBUIDOS PARA OS FILHOS (DOS QUAIS FILHOS SAO HEREDITARIEDADE)
/// 1 - VERIFICAR SE O FILHOS DOS GATOS PAIS SAO IRMAOS (SENDO QUE NEM SEMOPRE OS PAIS PASSADO SERAO REALMENTE OS PAIS BIOLOGICO) 

/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala11 {
    
    public static void main(String[] args) {
        
        /// VARIAVEIS PARA A IDADE
        short idadePai = 20;
        short idadeMae = 18;
         
        short idadeFilho1 = 15;
        short idadeFilho2 = 12;
        
        /// INSTANCIANDO OS OBJETOS (PAI, MAE E OS FILHOS)
        Gato gatoMae = new Gato("Perola", "Marrom", idadeMae, "f", "mae");
        Gato gatoPai = new Gato("Kraken", "Branco", idadePai, "m", "pai");
        
        Gato gatofilho1 = new Gato("Cristal", idadeFilho1, "m", gatoPai, gatoMae);
        Gato gatofilho2 = new Gato("Esmeralda", idadeFilho2, "f", gatoPai, gatoMae);
        
        if(gatofilho1.verificarDNA(gatofilho2)){
            
            System.out.println("O gato " + gatofilho1.getNome() + " e irmao do gato " + gatofilho2.getNome());
        }else{
            
            System.out.println("O gato " + gatofilho1.getNome() + " nao e irmao do gato " + gatofilho2.getNome());
        }
    
    }
     
 }
    
