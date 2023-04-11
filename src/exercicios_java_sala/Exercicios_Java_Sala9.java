/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import biblioteca_class_exercicios.Matriz;

/**
 *
 * @author ACER
 */

/*
29º Crie uma classe "Matriz" com os atributos "linhas" e "colunas" e um array 
bidimensional "matriz" de inteiros. Escreva um método que determine se a matriz 
é simétrica ou não, considerando que uma matriz é simétrica se a transposta da 
matriz é igual à matriz original.
*/

/// ARQUIVO - 1
/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala9 {
    
    public static void main(String[] args) {
        
        Matriz obcjt = new Matriz();
        
        /// ARRAY 3X3 NAO SIMETRICA
        int arryNoS[][] = {{0, -3, 2}, {3, 0, -1}, {-2, 1, 0}};
        
        /// ARRAY 3X3 SIMETRICA
        int arryYesS[][] = {{1, -2, 4}, {-2, 2, 0}, {4, 0, 3}};
        
        /// EXIBINDO QUE A MATRIZ E SIMETRICA
        obcjt.setBidimendionalArray(arryYesS);
        System.out.println(obcjt.symmetrical(obcjt. getBidimendionalArray()));
        
        /// EXIBINDO QUE A MATRIZ E NAO SIMETRICA
        obcjt.setBidimendionalArray(arryNoS);
        System.out.println(obcjt.symmetrical(obcjt. getBidimendionalArray()));
        
    }
}
