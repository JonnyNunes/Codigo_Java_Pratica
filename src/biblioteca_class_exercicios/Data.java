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
/// CLASSE DATA
/// METODO DE MOSTRA QUE PROXIMO DIA A DATA ATUAL
public class Data{
    
    /// ATRIBUTOS DA CLASSE
    private short dia;
    private EnumDate mes;
    private int ano;
    private int century;
    
    /// CONSTRUTOR
    public Data(short dia, EnumDate mes, int ano){
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.century = 2000; /// SECULO ATUAL
        
        verificarSeculo(century);
    }

    /// GET
    public short getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public EnumDate getMes() {
        return mes;
    }

    public int getCentury() {
        return century;
    }
    
    /// METODOS ===================================================
    
    /// DETERMINAR O PROXIMO DIA (RETORNA ZERO SE ALGO DER ERRADO OU NAO PODE PROSSEGUIR)
    public int diaPosterio(){
        
        /// O DIA NAO PODE SER NEGATIVO E NEM PASSAR DE 31 (DIA MAXIMO)
        if(getDia() < 1 || getDia() > 31){
            return 0;
        }
  
        /// VAR PARA RECEBER 1 SE O ANO FOR BISSEXTO
        int mesBissexto = 0;
        
        /// VERIFICAR SE O ANO E BISSEXTO
        if(leapYear(getAno(), getCentury())){ 
            mesBissexto++;
        }
        
        /// FOR PARA PERCORRER MEU ENUM DE MESES
        for(var listMes : EnumDate.values()){
            
            /// CASO FOR O MES DE FERVEREIRO, ENTAO UMA VERIFICACAO DIRETA E FEITA DIANTE DO ANO QUE PODE SER BISSEXTO OU NAO
            if(getMes().equals(EnumDate.FEBRUARY)){
                
                /// O DIA DITO COM O DIA MAXIMO DO MES (SE FOR BISSEXTO ENTAO E +1)
                if(getDia() == (getMes().getConstValue() + mesBissexto)){
                    
                    return 1;
                }else if(getDia() < getMes().getConstValue()){
                    
                    return (getDia() + 1);
                }
                
                return 0;
            }
            
            /// FAZENDO A VERIFICACAO EM CADA MES (COM EXECAO DO MES DE FERVEREIRO)
            if(getMes().equals(listMes)){
                
                if(getDia() == getMes().getConstValue()){
                    
                    return 1;
                }else{
                    
                    return (getDia() + 1);
                }
            }
        }
        return 0;
    }
    
    /// VERIFICAR O SECULO ATUAL PARA DEFINIR O PROXIMO SECULO (OPCIONAL)
    private void verificarSeculo(int x_century){
        if((ano - x_century) == (100 + 1)){
            century += 100;
        }
    }
    
    /// DETERMINAR SE O ANO ATUAL E BISSEXTO OU NAO
    private boolean leapYear(int currentYear, int century){
         
        /// QUANDO A DATA DO ANO TERMINAR EM 00
        if((currentYear - century) == 100){
            if(currentYear % 400 == 0){
                return true;
            }
        }
        
        /// DIVISAO POR 4 O ANO (TENDO COMO RESPOSTA O RESTO DA DIVISAO)
        if(currentYear % 4 == 0){ 
           return true;
        }
         
        return false;
    }
}
