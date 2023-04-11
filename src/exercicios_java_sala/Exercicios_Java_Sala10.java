/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;

import biblioteca_class_exercicios.EnumDate;
import biblioteca_class_exercicios.Data;
/**
 *
 * @author ACER
 */

/*
31º Crie uma classe "Data" com os atributos "dia", "mes" e "ano". Escreva um método 
que determine qual é o dia seguinte à data atual, considerando 
que fevereiro pode ter 28 ou 29 dias (em anos bissextos).
*/

/// ARQUIVO - 1
/// FUNCAO PRINCIPAL
public class Exercicios_Java_Sala10 {
    
    public static void main(String[] args) {
        
        /// DADOS DA DATA
        short day = 1;
        EnumDate mes = EnumDate.JULY;
        int anoBissexto = 5000;
        int anoNo = 2023;
        
        /// INSTANCIA DO OBJETO DA CLASSE DATA
        Data caledario = new Data(day, mes, anoBissexto);
        
        /// EXIBINDO O PROXIMO DIA
        System.out.println("O proximo dia e: " + caledario.diaPosterio());
        
    }
}
