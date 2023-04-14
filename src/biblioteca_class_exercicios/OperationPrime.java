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
/// CLASSE PARA AS OPERACOES DOS NUMEROS PRIMOS
public class OperationPrime {
    
    /// SABER SE O NUMERO E PRIMO
    public String integerPrime(int IntObjct){
        
       /// NUMERO PRIMOS SAO MAIORES QUE 1
       if(IntObjct <= 1){
           return "no_prime";
       }
       
       /// VAR PARA OBTER O RESULTADO DA DIVISAO
       int resultNoPrime = 0;
       
       /// O UNICO NUMERO PRIMO PAR E O 2
       if(IntObjct == 2){
           return "prime";
       }
        
       /// FOR PARA DETERMINAR SE O NUMERO NAO E PRIMO
       for(var i = 2; i < IntObjct; i++){
            
           /// RESULTADO DA DIVISAO DO NUMERO PELO O INTERVALOR
           resultNoPrime = (IntObjct / i);
            
           /// SE O RESULTADO MULTIPLICADO PELO O INTERVALOR DO NUMERO PRIMO FOR IGUAL AO NUMERO DA ENTRADA, ENTAO NAO E PRIMO
           if((resultNoPrime * i) == IntObjct){
               return "no_prime";
           }
       }
        
       /// QUANDO O FOR TERMINAR, ENTAO O NUMERO DE ENTRADA E PRIMO
       return "prime";
    }
    
    /// DETERMINAR SE O NUMERO PRIMO E UM MERSENNE PRIMO
    public String primeMersenne(int numX){
        
        /// O VALOR DA MERSENNE
        int mersenne = 0;
        
        /// SE O NUMERO DE ENTRADA NAO FOR PRIMO
        if(integerPrime(numX).contains("no_prime")){
            return "the number must be prime!! to be a mersenne cousin";
        }
        
        /// FOR PARA PERCORRER O DE 0 ATE O NUEMRO DE ENTRADA E DETERMINAR SE E UMA MERSENNE PRIMO
        for(var i = 0; i < numX; i++){
            
            /// DETERMINANDO SE O INTERVALO E PRIMO
            if(integerPrime(i).equals("prime")){
                
                /// OBTENDO O VALOR DA MERSENNE DA OCORRENCIA ATUAL
                mersenne = (int) (Math.pow(2, i) - 1);
                
                /// SE O VALOR DA MERSENNE FOR MAIOR QUE O VALOR DE ENTRADA, ENTAO O VALOR DA ENTRADA NAO E UMA MERSENNE PRIMO
                if(mersenne > numX){
                    return "mersenne no prime";
                }
                
                /// SE O VALOR DA MERSSENE FOR IGUAL A DA ENTRADA, ENTAO O VALOR DA ENTRADA E UM MERSEENE PRIMO
                if(mersenne == numX){
                    return "mersenne prime";
                }
            }
        }
        
        return "mersenne no prime";
    }
}
