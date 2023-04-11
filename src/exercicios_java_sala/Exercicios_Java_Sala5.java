/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import biblioteca_class_exercicios.Retangulo;
import java.util.Scanner;

/**
 *
 * @author ACER
 */

/*

7º Crie uma classe Retangulo com atributos largura e altura. 
Adicione métodos para calcular a área e o perímetro do retângulo. 
Escreva um programa em Java que cria um objeto Retangulo, solicita 
ao usuário as dimensões do retângulo e imprime a área e o perímetro.

*/

/// ARQUIVO 1
/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala5 {
    
    public static void main(String[] args) {
        
        /// INSTANCIANDO AS CLASSES
        Scanner read = new Scanner(System.in);
        Retangulo geometria = new Retangulo();
        
        /// CRIANDO DUAS VARS PARA LARGURA E ALTURA
        float lag = 0;
        float alt = 0;
        
        /// FAZENDO A LEITURA DA LARGURA E ALTURA
        System.out.print("Lagura do objeto retangular: ");
        lag = read.nextFloat();
        geometria.setLargura(lag);
        
        System.out.print("Altura do objeto retangular: ");
        alt = read.nextFloat();
        geometria.serAltura(alt);
        
        System.out.println();
        
        /// PASSANDO O OBJETO RETANGULO E RETORNANDO O VALOR DA EXPECTIVO METODO
        System.out.println("Area.......: " + geometria.determinaArea(geometria));
        System.out.println("Perimetro..: " + geometria.perimetro(geometria));
        System.out.println();
        
    }
    
}
