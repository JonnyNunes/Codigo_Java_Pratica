/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

/**
 *
 * @author ACER
 */

/// FUNCAO PRINCIPAL
/*
6º Escreva um programa em Java que recebe uma sequÃªncia de nÃºmeros do usuÃ¡
rio e imprime o nÃºmero que mais se repete. 
*/
import java.util.*; 

/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala15 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite os valores (separa por espaco): ");
        String[] numerosString = input.nextLine().split(" ");
        
        int[] numeros = new int[numerosString.length];
        
        for (int i = 0; i < numerosString.length; i++) { 
            numeros[i] = Integer.parseInt(numerosString[i]); 
        }
        
        Map<Integer, Integer> frequencia = new HashMap<Integer, Integer>();
        
        for (int numero : numeros){ 
            if (frequencia.containsKey(numero)) { 
                
                frequencia.put(numero, frequencia.get(numero) + 1); 
            } else { 
                    frequencia.put(numero, 1); 
                }   
        }
        int maiorFrequencia = 0; 
        int numeroMaisFrequente = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) { 
            int numero = entry.getKey();
            int freq = entry.getValue();
            
            if (freq > maiorFrequencia) { 
               maiorFrequencia = freq; numeroMaisFrequente = numero;
            } 
        } 
        
        System.out.println("O numero repetitivo: " + numeroMaisFrequente); 
        
        input.close();
    }
}
