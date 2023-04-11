/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;
import biblioteca_class_exercicios.Pessoa;
import biblioteca_class_exercicios.ContaBancaria;
/**
 *
 * @author ACER
 */

/*
12º Crie uma classe "ContaBancaria" com os atributos "titular", "saldo" e "limite". 
Escreva um método que permita sacar dinheiro da conta, considerando que o saldo não pode 
ficar negativo e que o valor do saque não pode ser maior que o saldo mais o limite.
*/

public class Exercicios_Java_Sala6 {
    
    public static void main(String[] args) {
        
        Pessoa Joao = new Pessoa("Joao Vitor", 987567456, "20/09/2002", "Fisica"); 
        ContaBancaria contaJoao = new ContaBancaria(Joao, 150, 400);
        
        /// SACANDO TODO O SALDO 
        System.out.println("Saldo sacado: " + contaJoao.sacarDinheiro(150));
        System.out.println("Saldo atual: " + contaJoao.getSaldo());
        
        /// SEM SALDO PARA SACAR (O SALDO NAO FIQUE NEGATIVO)
        System.out.println();
        System.out.println("Saldo sacado: " + contaJoao.sacarDinheiro(150));
        System.out.println("Saldo atual: " + contaJoao.getSaldo());
        
        /// EXIBINDO ALGUNS DADOS DO USER DA CONTA
        System.out.println("\nTitular do ultima sacada: " + contaJoao.getTitular().getNome() + " - " + contaJoao.getTitular().getData());
        System.out.println();
        
        /// NOVA INSTANCIA
        Pessoa Marcus = new Pessoa("Marcus Dantas", 988765805, "30/08/1976", "Juridica");
        ContaBancaria contaMarcus = new ContaBancaria(Marcus, 500, 500);
        
        System.out.println("Saldo sacado: " + contaMarcus.sacarDinheiro(275));
        System.out.println("Limite do saldo: " + contaMarcus.getLimite());
        System.out.println("Saldo atual: " + contaMarcus.getSaldo());
        
        System.out.println("\nTitular da ultima sacada: " + contaMarcus.getTitular().getNome() + " - " + contaMarcus.getTitular().getTipoPessoa());
    }
}
