/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ARQUIVO - 2
/// CLASSE DA CONTA BANCARIA
public class ContaBancaria {
    
    /// ATRIBUTOS E OBJETO
    Pessoa titular;
    double saldo;
    float limite;

    /// CONSTRUTOR
    public ContaBancaria(Pessoa titular, double saldo, float limite) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    /// GET
    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
    
    /// METODOS DE SAQUE
    public double sacarDinheiro(double _x_saque){
        
        if(saldo == 0){
            inforSemSaldo();
            return saldo;
        }
        
        if(_x_saque > limite){
            inforLimiteMax();
            return 0;
        }
        
        if(_x_saque > saldo){
            inforSaldoInsuficiente();
            return 0;
        }
        
        /// A OPERACAO PARA O SALDO ATUAL
        saldo -= _x_saque;
        
        if(saldo < 0){
            saldo = 0;
        }
        
        return _x_saque;
    }
    
    /// METODOS PARA INFORMAR ALGO A CONTA
    private void inforSemSaldo(){
        System.out.print("Sem saldo para saque! ");
    }
    
    private void inforLimiteMax(){
        System.out.print("Limite ultrapassado! ");
    }
    
    private void inforSaldoInsuficiente(){
        System.out.print("Saldo nao suficiente! ");
    }
}
