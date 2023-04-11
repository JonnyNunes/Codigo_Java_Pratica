/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ARQUIVO 2 - CLASSES E FUNCOES
public class AplicationComputer {
  
    private int vectorNumb[];
    
    /// CONSTRUTOR
    public AplicationComputer() {
        vectorNumb = new int[0];
    }
    
    /// =============================================== SET E GET
    public int[] getVectorClass(){
        return vectorNumb;
    }
    
    public void setVectorClass(int[] _vct_x){
        vectorNumb = _vct_x;
    }
    
    public void setTamanhoVector(int _x_size){
        vectorNumb = new int[_x_size];
    }
    /// ===============================================
    /// METODOS PROCEDIMENTAIS
    
    /// DETERMINAR A MEDIA
    public float mediaVectorElm(int[] _x_vct_numb){
        int soma = 0;
        float media = 0;
        
        /// FAZER A SOMA DOS ELEMENTOS DE BEGIN AO END DO VETOR
        for(var occurrenceVct: _x_vct_numb){
            soma += occurrenceVct;
        }
        media = (float) soma / _x_vct_numb.length; /// PASSAR A MEDIA DA DIVISAO DA SOMA COM O TAMANHO DO VETOR
        
        return media;
    }
    
    /// DESVIO PADRAO
    public double standardDeviation(int[] _x_vct_numb){
        int soma = 0;
        double media = 0;
        double StaDe = 0;
        
        /// OBTENDO A SOMA DOS ELEMENTOS DO VETOR
        for(var occurrenceVct: _x_vct_numb){
            soma += occurrenceVct;
        }
        
        /// OBTENDO A MEDIA DEPOIS DE REALIZAR A SOMATORIA
        media = (float) soma / _x_vct_numb.length;
        
        /// OBTENDO A SOMA DO DESVIO PADRAO QUE VAI FAZER A SUBTRACAO DA OCORRENCIA DO VETOR COM A MEDIA E ELEVAR AO QUADRADO
        for(var occurrenceVct: _x_vct_numb){
            StaDe += Math.pow(occurrenceVct - media, 2);
        }
       
        /// POR FIM, DETERMINAR A RAIZ QUADRADA DEPOIS DA SOMATORIA DOS ELEMENTOS PARA OBTER O DESVIO DA PADRAO DO VETOR
        return Math.sqrt(StaDe / _x_vct_numb.length);
    }
    
    /// MEDIANA
    public double medianaVector(int[] _x_vct_numb){
        
        /// SE O VALOR DO TAMANHO DO CONJUNTO FOR UM PAR
        if(_x_vct_numb.length % 2 == 0){
            /// CALCULANDO EM UMA SOMATORIA DOS DOIS VALORES CENTRAIS E DIVIDINDO POR 2
            double resultMedianaPar = (double) ((_x_vct_numb[_x_vct_numb.length / 2 - 1] + _x_vct_numb[ (int) (_x_vct_numb.length / 2)]) / 2);
            return resultMedianaPar;
        }
        
        /// SE O VALOR DO TAMANHO DO CONJUNTO FOR UM IMPAR
        if(_x_vct_numb.length % 2 == 1){
            /// RETORNANDO O VALOR CENTRAL DO VETOR
            double resultMedianaPar = (double) (_x_vct_numb[ (int) (_x_vct_numb.length / 2)]);
            return resultMedianaPar;
        }
        return 0;
    }
    
    /// METODO PARA ORGANIZAR EM ORDEM CRESCENTE UM VETOR
    public int[] organizarOrdemCrescente(int[] _vct_obj){
        
        /// DOIS FORs QUE VAI MANIPULAR OS DADOS PARA ATE UM LIMITE (O ULTIMO ELEMENTO) DO VETOR REPASSADO NO PARAMETRO
        for(int a = 0; a < _vct_obj.length - 1; a++){
            
            /// FOR INTERNO QUE VAI PEGAR ELEMENTO BASE E DETERMINAR COM OS OUTROS ELEMENTOS
            for(int i = 0, lastValor = 0; i < _vct_obj.length - 1; i++){
                
                /// SE A SOMA DO INCREMENTO DO FOR EXTERNO COM FOR INTERNO FOR IGUAL AO TAMANHO DO VETOR, ENTAO FECHA O FOR INTERNO
                if((i + a) == (_vct_obj.length - 1)){
                    break;
                }
                
                /// DETERMINA SE O VALOR BASE COMPARADO COM OS OUTROS VALORES DO VETOR FOR MAIOR, ENTAO FAZER A TROCA DE POSICAO
                if(_vct_obj[a] > _vct_obj[i + a + 2 - 1]){
                
                    lastValor = _vct_obj[i + a + 2 - 1]; /// PASSAR O VALOR MAIOR PARA VAR
                    _vct_obj[i + a + 2 - 1] = _vct_obj[a]; /// SUBSTITUIR O VALOR MAIOR DA POSICAO DE ORIGEM
                    _vct_obj[a] = lastValor; /// SUBSTITUIR O VALOR BASE COM O DO VALOR MENOR
                
                }
            }
        }
        
        return _vct_obj; /// RETORNANDO O VETOR ORGANIZADO EM ORDEM CRESCENTE
    }         
}
