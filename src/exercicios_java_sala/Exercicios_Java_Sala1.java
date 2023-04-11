/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;
import java.util.Random; /// IMPORTANDO A CLASSE RANDOM PARA GERAR OBJETOS ALEATORIOS
import java.util.Scanner;
import java.util.concurrent.TimeUnit; /// POCOTE PARA USAR O " TimeUnit.SECONDS.sleep() "
/**
 *
 * @author ACER
 */

/*
2º Escreva um programa em Java que simula um jogo de adivinhação. 
O programa deve gerar um número aleatório entre 1 e 100 e solicitar 
ao usuário que adivinhe o número.
*/
public class Exercicios_Java_Sala1 {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        /// INSTANCIANDO OBJETO DA CLASSE RANDOM (GERADOR ALEATORIOS DE OBJETOS)
        Random GeradorAleatorio = new Random();
        Scanner read = new Scanner(System.in);
        
        System.out.printf("JOGO DE ADIVINHACAO NUMERICA\n");
        
        /// DECLARACAO DAS VARs
        int numbGerado = GeradorAleatorio.nextInt(100) + 1, numbUser;
        
        System.out.println("\nGerando numero...");
        TimeUnit.SECONDS.sleep(2); ///PAUSAR NESSA LINHA
        
        System.out.println("\nQue numero voce acha que foi gerado? (de 1 a 100)");
        System.out.print("O numero: ");
        numbUser = read.nextInt();
        
        /// VERIFICAR SE O NUMERO E IGUAL AO DIGITADO
        if(numbGerado == numbUser){
            System.out.println("\nParabens! Voce acertou, e " + numbGerado);
        }else{
            System.out.println("\nInfelizmente voce errou! Era " + numbGerado);
        }
        
        /*
        TESTES
        for(int i = 0; i < 6; i++){
            /// ACESCENTANDO +1 PARA INICIAR COM 1 AO INVES DE 0
            /// System.out.println(GeradorAleatorio.nextInt(6) + 1);
            /// System.out.println(GeradorAleatorio.nextFloat() * 90);
        }
        */
        
    }
    
}
