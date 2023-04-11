/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import java.util.Scanner;

/**
 *
 * @author ACER
 */

/*
21º Escreva um programa que leia uma sequência de números inteiros e determine o
maior e o menor número da sequência. Utilize estruturas condicionais.
*/

/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala7 {
    
    public static void main(String[] args) {
      
      Scanner read = new Scanner(System.in);
        
      int sequenciaNumb = 0;
      int numero = 0;
      
      /// VARIAVEIS PARA O MAIOR E MENOR NUMERO
      int maior = 0;
      int menor = 0;
      
        System.out.print("Sequencia de entrada: ");
        sequenciaNumb = read.nextInt();
        System.out.println();
        
        while(sequenciaNumb > 0){
        
            System.out.print("valor: ");
            numero = read.nextInt();
            
            /// INICIALIZANDO COM O PRIMEIRO NUMERO DE ENTRADA O MAIOR E MENOR
            if(maior == 0){
                maior = numero;
                menor = numero;
            }
            
            if(numero < menor){
                menor = numero;
            }
            
            if(numero > maior){
                maior = numero;
            }
            
            sequenciaNumb--;
        }
        
        System.out.println();
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
