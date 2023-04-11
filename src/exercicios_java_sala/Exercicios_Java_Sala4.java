/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java_sala;
import biblioteca_class_exercicios.Agenda;
import biblioteca_class_exercicios.Contatos;

/**
 *
 * @author ACER
 */

/*
5º Crie uma classe Agenda que armazena informações de contatos. A classe deve ter
métodos para adicionar um contato, remover um contato e imprimir a lista de contatos. 
Escreva um programa em Java que usa a classe Agenda para criar uma agenda telefônica.
*/

/// ARQUIVO - 1

/// FUNCAO PRINCIPAL
/// MOSTRANDO FORMAS DE IMPLEMENTACAO (EM UM CODIGO NAO ESTRUTURADO)
public class Exercicios_Java_Sala4 {
    
    public static void main(String[] args) {
        
        /// INSTANCIANDO OBJETOS DAS CLASSES
        Contatos inforContatos = new Contatos();
        Agenda registros = new Agenda();
        
        /// TRES VARIAVEIS COM DADOS ESPECIFICOS PARA A ACRESCENTAR AO CONTATO
        String nome = "Jonny";
        String email = "gmail.com";
        int numero = 12345678;
        
        /// ATRIBUINDO OS DADOS, FAZENDO A INFORMACAO DE UM CONATO
        inforContatos.setNome(nome);
        inforContatos.setEmail(email);
        inforContatos.setNumero(numero);
       
        /// METODO DE ADICIONAR UM CONTATO A CLASSE DE AGENDA (EM UM VETOR DE CONTATO DA CLASSE)
        registros.addContatos(inforContatos);
        
       /// INSTACIANDO O OBJETO DE CONTATO E ADICIONANDO CADA INSTANCIA AO OBJETO DA CLASSE AGENDA
        inforContatos = new Contatos("Paulo", 929948, "hotmail.com");
        registros.addContatos(inforContatos);
        
        inforContatos = new Contatos("Ana", 21324, "yahoo.com");
        registros.addContatos(inforContatos);
        
        inforContatos = new Contatos("Matheus", 235242, "yahoo.com");
        registros.addContatos(inforContatos);
        
        System.out.println("MINHA LISTA DE CONTATO ==========================\n");
        /// METODO PARA MOSTRA TODOS OS MEUS CONTATOS REGISTRADOS
        registros.displayContatos();
        registros.displayAgentaTell();
        
        System.out.println();
        
        /// VETORES PARA FILTRAR AS INFORMACOES OS QUAIS O USER QUEIRA AGENDAR
        /// E OS QUE QUEIRA AGENDA PRECISA ESTA EXISTENTES A MINHA LISTA DE CONTATO
        String names[] = {"Jonny", "Paulo", "joao", "Ana"};
        int[] vectoNumb = {12345678, 929948, 2342, 21324};
        String email1[] = {"gmail.com", "hotmail.com", "yahoo", "yahoo.com"};
        
        System.out.println("LISTA DA AGENDA TELEFONICA ==========================\n");
        /// INSTANCIANDO A CLASSE AGENDA PARA ATRIBUIR A LISTAGEM DE AGENDAMENTO AO OBJETO
        Agenda agendTelefonica = new Agenda(registros, names, vectoNumb, email1);
        agendTelefonica.displayAgentaTell(); /// METODO PARA MOSTRAR A INFORMACAO DO AGENDAMENTO TELEFONICO
       
        System.out.println();
    }
}
