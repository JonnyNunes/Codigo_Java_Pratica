/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_java_sala;

import java.util.Scanner;

/**
 *
 * @author ACER
 */

/*

==== QUESTAO ====

1º Escreva um programa em Java que recebe uma sequência de palavras do 
usuário e imprime a palavra que aparece com mais frequência, ignorando maiúsculas e minúsculas.

*/

public class Exercicios_Java_Sala {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        String text;
        String delimit = " "; /// IRA PERMITIR QUE AO CHEGAR NO DELIMITADOR, DIVIDIR A MINHA STRING

        System.out.println("Escreva palavras (com espaco em branco a cada palavra)");
        System.out.print("Palavras: "); 
        text = ler.nextLine(); /// (INPUT) LER A STRING TEXT
        
        /// UM DETALHE: A FUNCAO SPLIT DA CLASSE STRING RETORNA UMA MATRIZ STRING (STRING[])
        System.out.println("A palavra: " + palavraRepetidaMais(text.split(delimit))); /// INVOCANDO A FUNCAO DE RETORNO COM A PALAVRA QUE MAIS SE REPETE
        
        System.out.println("\n===========================================");
    }

    /// FUNCAO PARA RETORNAR A PALAVRA QUE SE REPETE MAIS NA STRING
    /// O PARAMETRO RECEBE UMA MATRIZ STRING
    private static String palavraRepetidaMais(String[] _textString_Split) {
        
        /// DUAS VARIAVEIS INTEIRAS PARA INCREMENTAR E DAR O CONTROLE DA PALAVRA REPETITIVA
        int rept = 0;
        int reptAux = rept;
        String repetitiveWord = new String(); /// A STRING INSTANCIADA PARA OBTER O NOME QUE SE REPETE MAIS
        
        /// VAMOS RODAR EM DOIS FORs EM QUE IRA COMPARA AS LINHAS DA MATRIZ STRING
        for(int i = 0; i < _textString_Split.length; i++){
            
            /// FOR - PARA VERIFICAR CADA STRING (NA LINHA DA MATRIZ) SE ELAS SAO IGUAIS
            for(int j = 0; j < _textString_Split.length; j++){
                
               if(_textString_Split[i].equalsIgnoreCase(_textString_Split[j + 1 - 1])){ /// RETORNAR BOOL SE E IGUAL A PALAVRA COMPARADA
          
                   rept++; /// INCREMENTANDO A VAR INTEIRA, POIS PALAVRAS IGUAIS FORAM ENCONTRADA
                   
               }
               
            }
            
            /// VERIFICAR SE OCORREU A ALTERACAO DA PALAVRA MAIS REPETITIVA (OU SEJA, SE TEVE OUTRA QUE MAIS SE REPETIU)
            if(rept > reptAux){
                
                repetitiveWord = _textString_Split[i].toLowerCase();
                reptAux = rept; /// TROCANDO, POIS UMA OUTRA PALAVRA QUE MAIS SE REPETE FOI ENCONTRADA
                
            }
            rept = 0; /// INICIALIZANDO A VAR DE CONTROLE DE REPETICAO DA PALAVRA
            
        }
        return repetitiveWord; /// RETORNANDO A PALAVRA QUE MAIS SE REPETE
    }
}