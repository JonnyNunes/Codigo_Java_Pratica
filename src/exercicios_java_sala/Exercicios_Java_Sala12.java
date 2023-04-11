/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import biblioteca_class_exercicios.Programa_Dinamica;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
/*
34º Escreva um programa que leia uma sequência de números inteiros e determine
a maior subsequência crescente, considerando que uma subsequência crescente é 
uma sequência de números em que cada número é maior ou igual ao número anterior.
*/

/// ARQUIVO - 1
/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala12 {
    
    public static void main(String[] args) {
        
        /// INSTANCIANDO OS OBJETOS
        Scanner read = new Scanner(System.in);
        Programa_Dinamica vectorArry = new Programa_Dinamica();
     
        int numbAtribuir = 0;
        
        System.out.print("Quantos valores que voce vai atribuir? : ");
        numbAtribuir = read.nextInt();
        
        /// DETERMINAR O TAMANHO DO VETOR
        int arr[] = new int[numbAtribuir];
        
        /// FAZENDO A LEITURA DOS VALORES DE ENTRADAS
        System.out.println();
        for(var i = 0; i < numbAtribuir; i++){
            System.out.print("Valor: ");
            arr[i] = read.nextInt();
        }
        
        /// DETERMINAR E EXIBIR A SUBSEQUENCIA
        System.out.println();
        vectorArry.findLIS(arr);
        System.out.println();
    }
    
}
