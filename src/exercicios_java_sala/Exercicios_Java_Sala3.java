/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACER
 */

/*

4º Escreva um programa em Java que simula um jogo de dados. O programa deve solicitar ao usuário 
quantos jogadores vão jogar e quantas rodadas serão jogadas. Em cada rodada, o programa deve gerar 
um número aleatório para cada jogador e imprimir o jogador vencedor.

*/

public class Exercicios_Java_Sala3 {
    
    public static void main(String[] args) {
        
        /// INSTANCIANDO OS OBJETOS
        Random geradorDados = new Random();
        Scanner read = new Scanner(System.in);
       
        /// DOIS VETORES PARA JOGADORES E RODADAS (VALORES)
        int[] jogadores = new int[0];
        int[] rodada = new int[0];
        
        /// DUAS VARIAVEIS PARA DETERMINAR O TAMANHO OU QUANTIDADE DE JOGADORES E RODADAS
        int quatJogadores = 0;
        int quatRodadas = 0;
        
        System.out.print("Quantos jogadores (maximo 6): ");
        quatJogadores = read.nextInt();
        
        jogadores = new int[quatJogadores]; /// DETERMINANDO O TAMANHO DO VETOR DE JOGADORES DE ACORDO COM A QUANTIDADE
        
        
        System.out.print("\nQuantas rodadas: ");
        quatRodadas = read.nextInt();
        
        rodada = new int[quatRodadas]; /// DETERMINANDO O TAMANHO DO VETOR DE RODADA DE ACORDO COM A QUANTIDADE
        
        
        System.out.println();
        /// FOR PARA CADA RODADA
        for(var roundProx = 0; roundProx < quatRodadas; roundProx++){
            
            /// PASSANDO O VALOR DA RODADA
            rodada[roundProx] = geradorDados.nextInt(6) + 1;
            
            /// FOR PARA INICIALIZAR NOVOS VALORES AOS JOGADORES
            for(var valueJogador = 0; valueJogador < quatJogadores; valueJogador++){
                jogadores[valueJogador] = geradorDados.nextInt(6) + 1;
            }
            
            /// FOR PARA COMPARAR CADA VALOR DOS JOGADORES CORRESPONDENDO AO VALOR DA RODADA
            for(var compareValuePlay: jogadores){
                
                /// O PRIMEIRO QUE VENCEU, SERA O CAMPEAO, APESAR DE HAVER UM OUTRO QUE TEM O MESMO NUMERO
                if(compareValuePlay == rodada[roundProx]){
                    System.out.println("Parabes! o jogador com numero " + compareValuePlay + " venceu!");
                    break;
                }else{
                    System.out.println("Nao foi dessa vez!");
                }
            }
        
        }
        System.out.println();
    }
}
