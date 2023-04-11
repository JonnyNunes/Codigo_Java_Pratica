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
41º Escreva um programa que leia um número inteiro e determine a soma de seus 
dígitos elevados à quarta potência. Por exemplo, se o número lido for 1234, 
a soma será 1^4 + 2^4 + 3^4 + 4^4 = 354. Utilize funções do Java 8.
*/

/// CLASSE PRINCIPAL
public class Exercicios_Java_Sala14 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
       
        int resultNumbQuadrado = 0;
        int numb;
        
        System.out.print("Digita um numero : ");
        numb = read.nextInt();
        
        while(numb > 0){
            var digito = numb % 10;
            resultNumbQuadrado += (int) Math.pow(digito, 4);
            numb = numb / 10;
        }
       
        System.out.println("Resultado: " + resultNumbQuadrado);
        
    }
    
}
