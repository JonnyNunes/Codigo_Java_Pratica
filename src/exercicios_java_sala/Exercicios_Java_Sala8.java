/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import java.util.Scanner;
import biblioteca_class_exercicios.OperationPrime;

/**
 *
 * @author ACER
 */

/*
19º Escreva um programa que leia um número inteiro e determine se ele é um 
número primo de Mersenne ou não. Um número primo de Mersenne é um número primo da 
forma 2^p - 1, onde p é também um número primo. Utilize estruturas condicionais e loops.
*/

/// ARQUIVO - 1
/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala8 {
    
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        OperationPrime prime = new OperationPrime();
        
        int numero = 0;
        
        /// LEITURA DO NUMERO
        System.out.print("Valor: ");
        numero = read.nextInt();
        
        /// EXIBINDO SE O NUMERO E PRIMO E SE O NUMERO PRIMO E UMA MERSENNE PRIMO
        System.out.println("O numero e..: " + prime.integerPrime(numero));
        System.out.println("A mersenne e: " + prime.primeMersenne(numero));
        
    }
    
}
