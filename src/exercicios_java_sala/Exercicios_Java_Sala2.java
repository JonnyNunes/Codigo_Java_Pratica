/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import biblioteca_class_exercicios.AplicationComputer;
import java.util.Scanner;

/**
 *
 * @author ACER
 */

/*
3º Escreva um programa em Java que recebe uma sequência de números do usuário 
e imprime a média, o desvio padrão e a mediana dos números.
*/

/// ARQUIVO 1 - FUNCAO PRINCIPAL
public class Exercicios_Java_Sala2 {
    
    public static void main(String[] args) {
        
        /// INSTANCIAMENTO DOS OBJETOS
        Scanner read = new Scanner(System.in);
        AplicationComputer vectorOperation = new AplicationComputer();
        
        /// DECLARACAO DAS VARs
        int vetorNumb[] = new int[0]; /// VETOR PARA RECEBER A SEQUENCIA DOS NUMEROS DO USER
        int sequenceNumb = 0; /// VAR PARA DETERMINAR A SEQUENCIA DE LEITURA DOS NUMEROS
        
        System.out.println("Quantas sequencias de numeros interios para serem digitados?");
        System.out.print("Sequencia: ");
        sequenceNumb = read.nextInt(); /// LEITURA DA SEQUENCIA DE NUMEROS
        
        System.out.println();
        
        /// REDIFININDO O TAMANHO DO VETOR DA CLASSE CONRRESPONDENDO A SEQUENCIA DE NUMEROS
        vetorNumb = new int[sequenceNumb];
        vectorOperation.setTamanhoVector(sequenceNumb);
        
        /// FOR -> RODAR DE ACORDO COM A SEQUECIA PARA FAZER A LEITURA DO VETOR
        for(int i = 0; i < sequenceNumb; i++){
            System.out.print("Valor: ");
            vetorNumb[i] = read.nextInt();
        }
        
        /// PASSAR OS VALORES DO VETOR PARA O ATRIBUTO VETOR DA CLASSE E ORGANIZANDO EM ORDEM CRESCENTE
        vectorOperation.setVectorClass(vectorOperation.organizarOrdemCrescente(vetorNumb));
     
        System.out.println("\n================================================\n");
        
        /// TESTE: IMPRIME O VALOR DO VETOR DO OBJETO DA CLASSE
        /*
        for(int i = 0; i < vetorNumb.length; i++){
            System.out.println("Value: " + vectorOperation.getVectorClass()[i]);
        }
        */
        
        /// EXIBINDO AS OPERACOES DE MEDIA, DESVIO PADRAO E MEDIANA DO MEU OBJETO DA CLASSE
        System.out.println("Media......: " + vectorOperation.mediaVectorElm(vectorOperation.getVectorClass()));
        System.out.println("Des. Padrao: " + vectorOperation.standardDeviation(vectorOperation.getVectorClass()));
        System.out.println("Mediana....: " + vectorOperation.medianaVector(vectorOperation.getVectorClass()));
        
        System.out.println();
    }
    
}
