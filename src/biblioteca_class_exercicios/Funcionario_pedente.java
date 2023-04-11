/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */
public class Funcionario_pedente {
    
    private String nome;
    private double salBase;
    private double salLiquido;
    
    private double beneficios;
    private double desconto;
    private String cargo;
    
    public Funcionario_pedente(String nome, double salBase, String cargo) {
        
       this.nome = nome;
       this.salBase = salBase;
       this.cargo = cargo;
    }
    
    /// SET E GET
    public String getNome() {
        return nome;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getSalLiquido() {
        return salLiquido;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public void setSalLiquido(double salLiquido) {
        this.salLiquido = salLiquido;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    /// METODOS ================================================================
    
    /*
    public double determinarBeneficioFerias(Funcionario_pedente salBaseFunc, int numMesesTotal){
        
        if(numMesesTotal >= 12){
            
            salBaseFunc.salLiquido = (double value) -> {
               
                double result12Meses = 0;    
                double resultValueTrabalhado = 0;
                double resultAdicional = 0;
                
                result12Meses = (salBaseFunc.getSalBase() / 12);
                resultValueTrabalhado = (result12Meses * (numMesesTotal - 12));
                resultAdicional = (salBaseFunc.getSalBase() * (1/3));
                
                return varesultAdicional + resultValueTrabalhado;
                
            };
        }
        
    }
    */
     
    /*
    public double netSalary(){
    
    
    }
    */

   
}
