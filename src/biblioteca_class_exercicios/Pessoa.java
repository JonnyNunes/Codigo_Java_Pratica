/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ARQUIVO - 3
/// CLASSE PESSOA PARA ASSOCIA-LA A CONTA BANCARIA
public class Pessoa {
    
    /// ATRIBUTOS
    String nome;
    int cpf;
    String data;
    String tipoPessoa;
    
    /// CONSTRUTOR PARA INICIALIZACAO
    public Pessoa(String _x_nome, int _x_cpf, String _x_dataNasc, String _x_tipoPerson) {
        
        nome = _x_nome;
        cpf = _x_cpf;
        data = _x_dataNasc;
        tipoPessoa = _x_tipoPerson;
    }

    /// GET
    public int getCpf() {
        return cpf;
    }

    public String getData() {
        return data;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public String getNome() {
        return nome;
    }
    
}
